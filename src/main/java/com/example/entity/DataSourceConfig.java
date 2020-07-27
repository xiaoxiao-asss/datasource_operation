package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "use")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceConfig {
    private String datasource;
}
