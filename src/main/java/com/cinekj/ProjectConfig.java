
package com.cinekj;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    /* Los siguientes métodos son para incorporar el tema de internacionalización en el proyecto */

 /* localeResolver se utiliza para crear una sesión de cambio de idioma */
    @Bean
    public SessionLocaleResolver localeResolver() {
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.getDefault());
        slr.setLocaleAttributeName("session.current.locale");
        slr.setTimeZoneAttributeName("session.current.timezone");

        return slr;
    }

    /* localeChangeInterceptor se utiliza para crear un interceptor de cambio de idioma */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    //Bean para poder acceder a los Messages.properties en código...
    @Bean("messageSource")
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
    
    
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/registro/nuevo").setViewName("/registro/nuevo");
    }

  

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                .requestMatchers("/", "/index", "/images/**",
                        "/regis/**", "/js/**", "/webjars/**",
                        "/css/**", "/comidas", "/contacto",
                        "/nosotros", "/trabajaNosotros", "/iniciosesion/**", "/logout/**")
                .permitAll()
                .requestMatchers(
                        "/comida/admin",
                        "/comida/nuevo",
                        "/comida/eliminar/**",
                        "/comida/guardar/**",
                        "/comida/modificar/**",
                        
                        "/empleado/admin",
                        "/empleado/nuevo",
                        "/empleado/eliminar/**",
                        "/empleado/guardar/**",
                        "/empleado/modificar/**",
                        
                        "/entrada/adminEntrada",
                        "/entrada/nuevo",
                        "/entrada/eliminar/**",
                        "/entrada/guardar/**",
                        "/entrada/modificar/**",
                        
                        "/comida/admin",
                        "/comida/nuevo",
                        "/comida/eliminar/**",
                        "/comida/guardar/**",
                        "/comida/modificar/**",
                        
                        "/admin/admin",
                        "/admin/nuevo",
                        "/admin/eliminar/**",
                        "/admin/guardar/**",
                        "/admin/modificar/**",
                        
                        "/pelicula/admin",
                        "/pelicula/nuevo",
                        "/pelicula/eliminar/**",
                        "/pelicula/guardar/**",
                        "/pelicula/modificar/**",
                        
                        "/sala/admin",
                        "/sala/nuevo",
                        "/sala/eliminar/**",
                        "/sala/guardar/**",
                        "/sala/modificar/**",
                 
                        "/logout/**"
                ).hasRole("ADMIN")
                .requestMatchers(
                        "/panel",
                        "/reporte/**"
                        ,"/asientos/**"
                        ,"/asientosForm/**"
                        ,"/boleto/boleto"
                        ,"/boleto/guardar/**"
                        ,"/boleto/verificar/**"
                        ,"/acciones/panel"
                        
                ).hasAnyRole("ADMIN", "EMPLEADO")
                .requestMatchers(
                    "/comidas", "/contacto",
                    "/nosotros", "/trabajaNosotros")
                .hasRole("USER")
                )
                .formLogin((form) -> form
                .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll());
        
               
        return http.build();
    }

    
    @Bean
    public UserDetailsService users() {
        UserDetails admin = User.builder()
                .username("juan")
                .password("{noop}123")
                .roles("USER", "EMPLEADO", "ADMIN")
                .build();
        UserDetails sales = User.builder()
                .username("rebeca")
                .password("{noop}456")
                .roles("USER", "EMPLEADO")
                .build();
        UserDetails user = User.builder()
                .username("pedro")
                .password("{noop}789")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user, sales, admin);
    }*/

    
}
