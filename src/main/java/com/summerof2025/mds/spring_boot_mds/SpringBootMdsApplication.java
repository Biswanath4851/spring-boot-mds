package com.summerof2025.mds.spring_boot_mds;

import com.summerof2025.mds.spring_boot_mds.productentity.Order;
import com.summerof2025.mds.spring_boot_mds.productentity.Product;
import com.summerof2025.mds.spring_boot_mds.productrepository.OrderDao;
import com.summerof2025.mds.spring_boot_mds.productrepository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootMdsApplication implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private OrderDao orderDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting insert");
		Product product = new Product(2,"Watch",10000.00);
		productDao.save(product);

		Order order = new Order(101,"Biswanath", LocalDate.now());
		orderDao.save(order);
		System.out.println("insertion completed");
	}
}
