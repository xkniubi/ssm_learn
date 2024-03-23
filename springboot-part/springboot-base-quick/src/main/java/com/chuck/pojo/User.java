package com.chuck.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "chuck.info")
public class User {

    private String name;

    private String password;

    private List<String> gfs;
}
