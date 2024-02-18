package com.yugeshreganti.school.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class SecurityConfig {


    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        //http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
        //http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
        http.authorizeHttpRequests((requests) -> requests.requestMatchers("/home", "/").permitAll()
                .requestMatchers("/holidays/**").permitAll()
                .requestMatchers("/contact").authenticated()
                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/courses").permitAll()
                .requestMatchers("/about").permitAll()
                .requestMatchers("/assets/**").permitAll()
                .requestMatchers("/dashboard").authenticated()
                .requestMatchers("/login").permitAll()
        );
        http.csrf(AbstractHttpConfigurer::disable);
        http.formLogin(formLogin -> formLogin.loginPage("/login").defaultSuccessUrl("/dashboard")
                .failureUrl("/login?error=true").permitAll());
        http.logout(logout -> logout.logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll());
        http.httpBasic(withDefaults());
        return http.build();
    }


    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.
                withDefaultPasswordEncoder()
                .username("admin")
                .password("test")
                .roles("USER", "ADMIN")
                .build();
        UserDetails user = User.
                withDefaultPasswordEncoder()
                .username("user")
                .password("test")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}
