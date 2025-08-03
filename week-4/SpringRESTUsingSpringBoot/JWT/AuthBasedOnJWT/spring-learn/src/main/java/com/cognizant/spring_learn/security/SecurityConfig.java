package com.cognizant.spring_learn.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.cognizant.spring_learn.service.JWTService;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);
    
    @Autowired
    private JWTService jwtService;
    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        LOGGER.info("Creating in-memory users");
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder.encode("pwd"))
                .roles("ADMIN")
                .build();
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder.encode("pwd"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                    .httpBasic(Customizer.withDefaults())
                    .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/country/getAll").hasRole("USER")
                        .requestMatchers("/country/getIndia").hasRole("ADMIN")
                        .requestMatchers("/auth/authenticate").hasAnyRole("ADMIN","USER")
                        .anyRequest().authenticated())
                        .addFilterBefore(new JwtAuthorizationFilter(jwtService),UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
