package cn.sdack.reactor.core.configuration

import cn.sdack.reactor.core.controller.IndexController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.*

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2020/11/3
 * Time: 18:12
 */
@Configuration
class Router {
    @Bean
    fun route(indexController: IndexController): RouterFunction<ServerResponse?>? {
        val route = RouterFunctions.route()
        return RouterFunctions
                .route(
                        RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        HandlerFunction { request: ServerRequest? -> indexController.hello(request)!! })


    }
}