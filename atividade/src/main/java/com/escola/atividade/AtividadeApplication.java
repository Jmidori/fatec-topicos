package com.escola.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class AtividadeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AtividadeApplication.class, args);

		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("");
	}


}
