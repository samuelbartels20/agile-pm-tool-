package com.skillembassy.pmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class PmtoolApplication {

	public static void main(String[] args) {

		SpringApplication.run(PmtoolApplication.class, args);
	}

}
