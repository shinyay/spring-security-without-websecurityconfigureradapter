package io.spring.shinyay.security.controller

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableWebSecurity
class SecuredController {

    @GetMapping("/secured")
    fun secured(): String {
        return "Secured"
    }

    @GetMapping("/home")
    fun home(): String {
        return "Home"
    }
}
