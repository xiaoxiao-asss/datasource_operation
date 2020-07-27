package com.example.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


@Data
public class DataSourceDTO {

    @NotBlank
    private String pollName;

    @NotBlank
    private String driverClassName;

    @NotBlank
    private String url;

    @NotBlank
    private String username;

    private String password;
}
