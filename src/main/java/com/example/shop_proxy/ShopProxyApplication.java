package com.example.shop_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShopProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopProxyApplication.class, args);
	}

}
