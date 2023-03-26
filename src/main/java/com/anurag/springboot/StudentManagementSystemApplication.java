package com.anurag.springboot;

import com.anurag.springboot.entities.Student;
import com.anurag.springboot.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		Student s1 = new Student("Anurag", "Mukherjee", "anurag@gmail.com");
//		studentRepository.save(s1);
//
//		Student s2 = new Student("Anuradha", "Poddar", "anuradha@gmail.com");
//		studentRepository.save(s2);
//
//		Student s3 = new Student("Raj", "Chatterjee", "raj@gmail.com");
//		studentRepository.save(s3);
//	}
}
