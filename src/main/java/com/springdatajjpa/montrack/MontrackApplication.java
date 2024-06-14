package com.springdatajjpa.montrack;

import com.springdatajjpa.montrack.config.RsaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaConfiguration.class)
@SpringBootApplication
public class MontrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontrackApplication.class, args);
	}

}
