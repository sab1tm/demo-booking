package com.example.demo;

import com.example.demo.models.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserEntity user = new UserEntity();
		user.setEmail("test@mail.kz");
		user.setRole("ADMIN");
		user = userService.save(user);

		System.out.println(user);

		List<UserEntity> admins = userService.getByRole("ADMIN");

		System.out.println(admins);

		// test hotels, rooms

		// get hotel by city

		// get rooms by hotel

		// print
	}
}
