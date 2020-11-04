package cn.sdack.reactor.core.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/11/3
 * Time: 18:11
 */
@RestController
class IndexController {

    fun hello(request: ServerRequest?): Mono<ServerResponse?>? {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Hello, Spring!"))
    }



}