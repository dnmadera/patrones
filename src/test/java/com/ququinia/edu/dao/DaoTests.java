package com.ququinia.edu.dao;

import com.ququinia.edu.model.Patron;
import com.ququinia.edu.service.PatronService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoTests {

	@Autowired
	PatronService patronService;

	@Test
	void contextLoads() {
		for (Patron p : patronService.getAll()) {
			System.out.println(p);
		};
	}


	@Test
	void addNuevoPatron(){
		Patron p = new Patron();
		p.setAction("/unAction");
		p.setDescription("Nuevo patron test");
		p.setName("NuevoTXT");

		patronService.save(p);
		assert patronService.findByName("NuevoTXT").getName().equals("NuevoTXT");

	}




}
