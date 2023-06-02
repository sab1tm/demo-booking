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
		UserEntity admin = new UserEntity();
		admin.setId(1L);
		admin.setEmail("admin@mail.kz");
		admin.setRole("ADMIN");
		userService.save(admin);

		UserEntity user = new UserEntity();
		user.setId(2L);
		user.setEmail("user@mail.kz");
		user.setRole("USER");
		userService.save(user);

		List<UserEntity> admins = userService.getByRole("ADMIN");
		List<UserEntity> users = userService.getByRole("USER");

		System.out.println(admins);
		System.out.println(users);




		// test hotels, rooms

		// get hotel by city

		// get rooms by hotel

		// print
	}
}
