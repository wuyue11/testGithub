package com.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
public class MyWebMvcConfig extends WebMvcAutoConfiguration{
    @Bean
    public Connector getConnector(){
        Connector connector=new Connector();
        connector.setPort(80);
        connector.setScheme("http");
        return connector;
    }
    @Bean
    public ServletWebServerFactory getServletWebServerFactory(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(getConnector());
        return tomcat;
    }
}
