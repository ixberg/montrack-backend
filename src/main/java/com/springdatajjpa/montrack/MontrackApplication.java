package com.springdatajjpa.montrack;

import com.springdatajjpa.montrack.config.RsaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude = RsaConfiguration.class)
@SpringBootApplication
public class MontrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontrackApplication.class, args);
	}

}
