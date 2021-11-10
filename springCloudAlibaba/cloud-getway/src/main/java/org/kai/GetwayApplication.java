package org.kai;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务注册发现
public class GetwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayApplication.class,args);
    }
}