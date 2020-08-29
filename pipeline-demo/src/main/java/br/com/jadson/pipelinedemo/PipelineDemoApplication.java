package br.com.jadson.pipelinedemo;

import br.com.jadson.pipelinedemo.domain.ports.CalculatorServiceImpl;
import br.com.jadson.pipelinedemo.services.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PipelineDemoApplication {

	/**
	 * Run the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PipelineDemoApplication.class, args);
	}

	/**
	 * Define concrete service.
	 * @return
	 */
	@Bean
	public CalculatorService calculatorService(){ return new CalculatorServiceImpl(); }

}
