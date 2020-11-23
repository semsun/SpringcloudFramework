package net.semsun;

import net.semsun.filter.Test1Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class Test1App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Test1App.class, args);
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        Test1Filter filter = new Test1Filter();
        registrationBean.setFilter(filter);

        /*
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/t1/*");

        registrationBean.setUrlPatterns(urlPatterns);
        */

        return registrationBean;
    }
}
