package com.meta.spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.meta.spring_data_jpa.model.Student;
import com.meta.spring_data_jpa.repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1 = applicationContext.getBean(Student.class);
		Student s2 = applicationContext.getBean(Student.class);
		Student s3 = applicationContext.getBean(Student.class);
		StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
		s1.setMarks(20);
		s1.setName("ankit");
		s1.setRollNo(13);

		s2.setMarks(102);
		s2.setName("bina");
		s2.setRollNo(14);

		s3.setMarks(34);
		s3.setName("sima");
		s3.setRollNo(15);
		// studentRepo.save(s1);
		// studentRepo.save(s2);
		// studentRepo.save(s3);
		System.out.println("findAll  " + studentRepo.findAll());
		System.out.println("find  " + studentRepo.findById(13).orElse(null));
		System.out.println("Find by name " + studentRepo.findByName("bina"));
		System.out.println("Find by findByMarksGreaterThan " + studentRepo.findByMarksGreaterThan(70));
		// System.out.println("Find by findAnkit " + studentRepo.findAnkit("ankit"));
	}

}
