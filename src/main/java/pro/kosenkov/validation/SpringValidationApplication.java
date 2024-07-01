package pro.kosenkov.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringValidationApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringValidationApplication.class, args);
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

}
