package com.H2DataBase;

import com.H2DataBase.Model.Person;
import com.H2DataBase.Repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2DataBaseApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2DataBaseApplication.class, args);
		PersonRepository personRepository =
				configurableApplicationContext.getBean(PersonRepository.class);

		Person myPerson = new Person("John", "Doe");
		personRepository.save(myPerson);
	}

}
