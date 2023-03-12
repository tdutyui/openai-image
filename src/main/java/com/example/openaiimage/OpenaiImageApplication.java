package com.example.openaiimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.openaiimage.client")
public class OpenaiImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenaiImageApplication.class, args);
	}
}
