package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class warehouseApplication extends SpringBootServletInitializer{

	// war deploy
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(warehouseApplication.class);
	}
		
	public static void main(String[] args) {
		SpringApplication.run(warehouseApplication.class, args);
	}

}
