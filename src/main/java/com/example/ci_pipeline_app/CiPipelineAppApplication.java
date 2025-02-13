package com.example.ci_pipeline_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiPipelineAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiPipelineAppApplication.class, args);
		// Inside a controller or service method
		
		}
		@GetMapping
		public String greeting() {
			return "Good Afternoon, Riyadh, Welcome to COMP367";

	}

}
