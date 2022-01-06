package com.xyu.user.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Data
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;

    private String wuhao;
}
