package com.cg.bankApplication.ParallelProjectPhase4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
@EntityScan("com.cg.bankApplication.bean")
public class ParallelProjectPhase4Application {

	public static void main(String[] args) {
		SpringApplication.run(ParallelProjectPhase4Application.class, args);
	}

}
