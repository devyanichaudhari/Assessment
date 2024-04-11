package com.onetomany;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.onetomany.model.Apps;
import com.onetomany.model.Mobile;
import com.onetomany.repository.AppRepository;
import com.onetomany.repository.MobileRepository;

@SpringBootApplication
public class SpringBootOneToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootOneToManyApplication.class, args);
		MobileRepository mobileRepo = context.getBean(MobileRepository.class);
		AppRepository appRepo = context.getBean(AppRepository.class);
		Mobile mob = new Mobile("IPhone","Samsung");
		mobileRepo.save(mob);
		appRepo.save(new Apps("WhatsApp",25,mob));
		appRepo.save(new Apps("Hike",25,mob));
		appRepo.save(new Apps("LinkedIN",25,mob));
		//2. Find All.
		List<Mobile> mobiles = mobileRepo.findAll();
		for(Mobile m: mobiles) {
		System.out.println(m);
		}
		//3. Find By Mobile Name
		List<Mobile> name = mobileRepo.findByMobileName("Galaxy");
		for(Mobile m: name) {
		System.out.println(m);
		}
		/*//4. Getting parent table from child
		List<Apps> list= appRepo.findMobileById(3);
		for(Apps a: list) {
		System.out.println(a.getMobile_Name());
		}*/
		
	}

}
