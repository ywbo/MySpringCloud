package org.ilearning.bootorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOrderApplication.class, args);
	}

}
