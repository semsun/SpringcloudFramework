package net.semsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"net.semsun.controller"})
public class FeignApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(FeignApp.class, args);
    }
}
