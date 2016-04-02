package br.com.caelum.fj91.performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableCaching
@EnableJms
@EnableCircuitBreaker
public class Boot {

	public static void main(String[] args) {
		SpringApplication.run(Boot.class, args);
	}
}
