package io.spring.shinyay.security.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService

@Configuration
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfigurerAdapter(){

    override fun configure(http: HttpSecurity?) {
        http
                // Do not restrict access to "/"
                ?.authorizeRequests()
                ?.antMatchers("/")
                ?.permitAll()
                // Authentication is required for all other passes.
                ?.anyRequest()
                ?.authenticated()
                // Login is "/login"
                ?.and()
                ?.formLogin()
                ?.loginPage("/login")
                // Logout is "/logout"
                ?.and()
                ?.logout()
                ?.logoutUrl("/logout")
                ?.logoutSuccessUrl("/")
    }

    @Bean
    override fun userDetailsService(): UserDetailsService {
        return super.userDetailsService()
    }
}
