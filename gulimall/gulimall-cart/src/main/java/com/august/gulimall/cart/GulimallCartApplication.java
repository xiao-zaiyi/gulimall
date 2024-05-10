package com.august.gulimall.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession // 开启session共享
@SpringBootApplication
@EnableFeignClients(basePackages = "com.august.gulimall.cart.feign")
public class GulimallCartApplication {
	public static void main(String[] args) {
		SpringApplication.run(GulimallCartApplication.class, args);
	}

}
