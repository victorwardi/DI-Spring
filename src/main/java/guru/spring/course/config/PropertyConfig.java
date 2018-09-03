package guru.spring.course.config;

import guru.spring.course.examples.FakeDataSource;
import guru.spring.course.examples.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * Created by Victor Wardi - @vwardi - on 03/09/2018.
 */

@Configuration
/*
Commenting this because I am using application.properties to hold all properties
PropertySources(
        {@PropertySource("classpath:datasource.properties"),
                @PropertySource("classpath:jms.properties")})*/
public class PropertyConfig {

    @Value("${guru.user}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;

    @Value("${guru.jms.user}")
    String userJMS;
    @Value("${guru.jms.password}")
    String passwordJMS;
    @Value("${guru.jms.url}")
    String urlJMS;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker() {
        return new FakeJMSBroker(userJMS, passwordJMS, urlJMS);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();

    }
}
