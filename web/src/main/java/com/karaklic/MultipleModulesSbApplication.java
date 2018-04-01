package com.karaklic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses = CoreComponents.class)
@ComponentScan(basePackageClasses = {CoreComponents.class,WebComponents.class})
@EnableJpaRepositories(basePackageClasses = CoreComponents.class)
public class MultipleModulesSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleModulesSbApplication.class, args);
	}
}
