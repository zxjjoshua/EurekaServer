package com.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * CSRF configuration
     * This configuration aims at configure CSRF to enable cross site visit.
     * "The problem was the CSRF and for some reason spring couldn't authenticate user configured in application.yml"
     * Solution referred from https://stackoverflow.com/questions/50971891/how-to-secure-spring-cloud-eureka-service-with-basic-auth
     * Here we set csrf to ignore all resource that matches "/eureka/**"
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
