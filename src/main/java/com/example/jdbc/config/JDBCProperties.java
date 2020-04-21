package com.example.jdbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 只能读取application.yml
 *
 */
@ConfigurationProperties(prefix = "spring.datasource")
public class JDBCProperties {
    private String driverclassname;
    private String url;
    private String username;

    public String getDriverclassname() {
        return driverclassname;
    }

    public void setDriverclassname(String driverclassname) {
        this.driverclassname = driverclassname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
