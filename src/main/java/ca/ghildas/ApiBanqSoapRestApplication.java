package ca.ghildas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("config-bean.xml")
public class ApiBanqSoapRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBanqSoapRestApplication.class, args);
	}
}
