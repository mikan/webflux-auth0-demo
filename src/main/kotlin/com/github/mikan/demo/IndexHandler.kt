package com.github.mikan.demo

import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.*
import reactor.core.publisher.Mono

@Component
class IndexHandler {

    @Bean
    fun indexRoutes(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.GET("/"), HandlerFunction { get(it) })
    }

    fun get(request: ServerRequest): Mono<ServerResponse> {
        return request.principal().map { (it as OAuth2AuthenticationToken).principal }.flatMap {
            ServerResponse.ok().contentType(MediaType.TEXT_HTML).render("index", mapOf(
                    "title" to "webflux-auth0-demo",
                    "username" to it.name,
                    "attributes" to it.attributes
            ))
        }
    }
}
