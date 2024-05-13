package com.javarush.jira;

import com.javarush.jira.common.internal.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Map;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EnableCaching
public class JiraRushApplication {

    public static void main(String[] args) {

        Map<String,String> env = System.getenv();
        String SPRING_DATASOURCE_USERNAME = env.get("SPRING_DATASOURCE_USERNAME");
        String SPRING_DATASOURCE_PASSWORD = env.get("SPRING_DATASOURCE_PASSWORD");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITHUB_CLIENT_ID = env.get("SPRING_SECURITY_OAUTH2_CLIENT_ID");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITHUB_CLIENT_SECRET = env.get("SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITHUB_CLIENT_SECRET");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GOOGLE_CLIENT_ID = env.get("SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GOOGLE_CLIENT_ID");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GOOGLE_CLIENT_SECRET = env.get("SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GOOGLE_CLIENT_SECRET");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITLAB_CLIENT_ID = env.get("SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITLAB_CLIENT_ID");
        String SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITLAB_CLIENT_SECRET = env.get("SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_GITLAB_CLIENT_SECRET");
        String SPRING_MAIL_USERNAME = env.get("SPRING_MAIL_USERNAME");
        String SPRING_MAIL_PASSWORD = env.get("SPRING_MAIL_PASSWORD");



        SpringApplication.run(JiraRushApplication.class, args);
    }
}
