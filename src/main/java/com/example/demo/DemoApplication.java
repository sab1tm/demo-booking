package com.example.demo;

import com.example.demo.models.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

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
		admin.setCity("Astana");
		admin.setHotel("HILTON");
		admin.setRoom(101L);
		userService.save(admin);

		UserEntity user = new UserEntity();
		user.setId(2L);
		user.setEmail("user@mail.kz");
		user.setRole("USER");
		user.setCity("Almaty");
		user.setHotel("RIXOS");
		user.setRoom(245L);
		userService.save(user);

		UserEntity user1 = new UserEntity();
		user.setId(3L);
		user.setEmail("user1@mail.kz");
		user.setRole("USER");
		user.setCity("Almaty");
		user.setHotel("RIXOS");
		user.setRoom(289L);
		userService.save(user1);

		UserEntity user2 = new UserEntity();
		user.setId(4L);
		user.setEmail("user2@mail.kz");
		user.setRole("USER");
		user.setCity("Astana");
		user.setHotel("HILTON");
		user.setRoom(117L);
		userService.save(user2);

		List<UserEntity> admins = userService.getByRole("ADMIN");
		List<UserEntity> users = userService.getByRole("USER");
		List<UserEntity> cities = userService.getByCity("Astana");
		List<UserEntity> hotels = userService.getByHotel("RIXOS");
		List<UserEntity> rooms = userService.getByRoom(1L);

		System.out.println(admins);
		System.out.println(users);
		System.out.println(cities);
		System.out.println(hotels);
		System.out.println(rooms);


		// test hotels, rooms

		// get hotel by city

		// get rooms by hotel

		// print
	}
}