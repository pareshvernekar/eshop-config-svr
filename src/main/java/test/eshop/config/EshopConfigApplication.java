package test.eshop.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EshopConfigApplication {

	public static void main(String[] argv) {
		SpringApplication.run(EshopConfigApplication.class,argv);
	}
}
