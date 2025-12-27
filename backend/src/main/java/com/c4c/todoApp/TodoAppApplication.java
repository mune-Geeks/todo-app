package com.c4c.todoApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.c4c.todoApp.dao.AccountDAO;
import com.c4c.todoApp.dao.MembershipDAO;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
		return args -> {

			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);

		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		// call the business method
		theAccountDAO.addAccount();

		// call the membership business method
		theMembershipDAO.addAccount();
	}
}
