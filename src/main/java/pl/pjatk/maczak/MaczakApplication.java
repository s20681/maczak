package pl.pjatk.maczak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MaczakApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext;
		SpringApplication.run(MaczakApplication.class, args);
	}

}