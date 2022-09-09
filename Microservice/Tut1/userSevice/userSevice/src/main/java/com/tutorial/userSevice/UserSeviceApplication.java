package com.tutorial.userSevice;

import com.tutorial.userSevice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserSeviceApplication {
	@Autowired
	private User user;
	public static void main(String[] args) {

		SpringApplication.run(UserSeviceApplication.class, args);
	}

}
