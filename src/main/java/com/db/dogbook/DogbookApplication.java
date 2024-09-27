package com.db.dogbook;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan({"com.db"})
@PropertySource("classpath:/config/*.properties")
@EnableCaching(proxyTargetClass = true)
@RequiredArgsConstructor
public class DogbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogbookApplication.class, args);
	}

}
