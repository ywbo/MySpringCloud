package org.ilearning.bootaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAccountApplication.class, args);
	}

}
