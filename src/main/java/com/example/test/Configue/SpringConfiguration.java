package com.example.test.Configue;

import com.example.test.model.Player;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class SpringConfiguration implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] preventMethod = {HttpMethod.GET,HttpMethod.POST,HttpMethod.PUT,HttpMethod.DELETE};
   config.getExposureConfiguration()
           .forDomainType(Player.class)
           .withItemExposure((metdata, httpMethods) -> httpMethods.disable(preventMethod))
           .withItemExposure((metdata, httpMethods) -> httpMethods.disable(preventMethod));
    }
}
