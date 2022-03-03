package io.spring.shinyay.security.controller

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@RestController
@EnableWebSecurity
class SecuredController {

    @GetMapping("/secured")
    fun secured(): String {
        return "Secured"
    }

    @GetMapping("/")
    fun home(): String {
        return "Hello at ${ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))}"
    }
}
