// DemoApplication.java
package com.example.demo;

import com.example.demo.models.entity.HotelEntity;
import com.example.demo.models.entity.UserEntity;
import com.example.demo.service.HotelService;
import com.example.demo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final UserService userService;
	private final HotelService hotelService;

	public DemoApplication(UserService userService, HotelService hotelService) {
		this.userService = userService;
		this.hotelService = hotelService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HotelEntity hilton = new HotelEntity();
		hilton.setName("HILTON");
		hilton = hotelService.save(hilton);

		HotelEntity rixos = new HotelEntity();
		rixos.setName("RIXOS");
		rixos = hotelService.save(rixos);

		UserEntity admin = new UserEntity();
		admin.setId(1L);
		admin.setEmail("admin@mail.kz");
		admin.setRole("ADMIN");
		admin.setCity("Astana");
		admin.setHotel(hilton);
		admin.setRoom(101L);
		userService.save(admin);

		UserEntity user = new UserEntity();
		user.setId(2L);
		user.setEmail("user@mail.kz");
		user.setRole("USER");
		user.setCity("Almaty");
		user.setHotel(rixos);
		user.setRoom(245L);
		userService.save(user);

		UserEntity user1 = new UserEntity();
		user1.setId(3L);
		user1.setEmail("user1@mail.kz");
		user1.setRole("USER");
		user1.setCity("Almaty");
		user1.setHotel(rixos);
		user1.setRoom(289L);
		userService.save(user1);

		UserEntity user2 = new UserEntity();
		user2.setId(4L);
		user2.setEmail("user2@mail.kz");
		user2.setRole("USER");
		user2.setCity("Astana");
		user2.setHotel(hilton);
		user2.setRoom(117L);
		userService.save(user2);

		List<UserEntity> admins = userService.getByRole("ADMIN");
		List<UserEntity> users = userService.getByRole("USER");
		List<UserEntity> cities = userService.getByCity("Astana");
		List<UserEntity> hotels = userService.getByHotel(rixos);
		List<UserEntity> rooms = userService.getByRoom(1L);

		System.out.println(admins);
		System.out.println(users);
		System.out.println(cities);
		System.out.println(hotels);
		System.out.println(rooms);

		List<UserEntity> hotelsByCity = userService.getByCity("Astana");
		System.out.println("Hotels in Astana: ");
		for (UserEntity hotel : hotelsByCity) {
			System.out.println(hotel.getHotel().getName());
		}

		List<UserEntity> roomsByHotel = userService.getByHotel(rixos);
		System.out.println("Rooms in RIXOS: ");
		for (UserEntity room : roomsByHotel) {
			System.out.println(room.getRoom());
		}

		List<HotelEntity> allHotels = hotelService.getAllHotels();
		System.out.println("All Hotels:");
		for (HotelEntity hotel : allHotels) {
			System.out.println(hotel.getName());
		}
	}
}