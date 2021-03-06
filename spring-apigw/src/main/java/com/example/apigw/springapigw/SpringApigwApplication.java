package com.example.apigw.springapigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class SpringApigwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApigwApplication.class, args);
	}

}
