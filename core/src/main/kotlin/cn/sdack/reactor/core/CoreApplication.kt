package cn.sdack.reactor.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import reactor.core.publisher.Mono
import reactor.netty.NettyInbound
import reactor.netty.NettyOutbound
import reactor.netty.tcp.TcpServer


@SpringBootApplication
class CoreApplication

fun main(args: Array<String>) {
	runApplication<CoreApplication>(*args)
	val server = TcpServer.create()
			.handle { inbound: NettyInbound?, outbound: NettyOutbound ->
				val then = inbound!!.receive().then()
				outbound.sendString(Mono.just("hello"))
			}
			.bindNow()

	server.onDispose()
			.block();
}
