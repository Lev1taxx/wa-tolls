package com.example.watolls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WaTollsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaTollsApplication.class, args);
	}
}
