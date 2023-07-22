package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	@Autowired
	StudentRepo studentRepo;


	public static void main(String[] args)
	{

		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
//		Student s1=new Student("Arun Kumar","Salpala","ArunKumarsalpala@gmail.com");
//		studentRepo.save(s1);
//
//		Student s2=new Student("Sai Venkat","Salpala","saivenkatsalpala@gmail.com");
//		studentRepo.save(s2);
//
//		Student s3=new Student("Tony","Stark","tonystark@gmail.com");
//		studentRepo.save(s3);


	}
}
