package com.example.jpa_query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jpa_query.StudentRepo.StudentRepo;
import com.example.jpa_query.entities.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootApplication
public class JpaQueryApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(JpaQueryApplication.class, args);
	StudentRepo stRepo =context.getBean(StudentRepo.class);	

	// tutoeial 3 of becoder
//	Student student1=new Student();
//	student1.setName("Rakesh Das");
//	student1.setAddress("Delhi");
//	student1.setId(1);
//	stRepo.save(student1);

//		student1.setName("Ramesh");
//		student1.setAddress("Mumbai");
//		student1.setId(2);
//		stRepo.save(student1);

//		List<Student> list=(List<Student>)stRepo.findAll();
//		list.forEach(student ->System.out.println(student));


//		Student st= stRepo.findById(1).get();
//		System.out.println(st);

		// one way it shows data on the table in workbench
//		st.setName("John");
//		st.setAddress("bombay");
//		stRepo.save(st);
//		System.out.println("updated data ");

		// another way it shows data on console screen
//		Student updatedStudent = stRepo.save(st);
//
//		System.out.println(updatedStudent);

//		stRepo.delete(st);
//		System.out.println("Delete sucessfully");


// tutorial becoder 5
//	Student st= stRepo.findByName("Rakesh Das");
//	System.out.println(st);

//		Student st1= stRepo.findByAddress("Delhi");
//System.out.println(st1);

// to print the list of the name and address of more than one student
//		List <Student> st2= stRepo.findByNameOrAddress("Delhi");
//st2.forEach(e->System.out.println(e));

//		// tutorial 8 and last tutorial(pagination)
		// sort all the data in the database
		// Way 1
		Sort sort = Sort.by(Sort.Direction.ASC, "name");
		// way 2
		Sort sort=Sort.by("id").ascending();
		List<Student> students=stRepo.findAll(sort);
		System.out.println(" list of students");
		// way 1 to print the list of sorted students
		students.forEach(System.out::println);
		// way2 to print the list
		students.forEach(e  -> System.out.println(e));



//		Pageable pageable= PageRequest.of(0,10);
		// sorting which perform according to the page
		Pageable pageable= PageRequest.of(1,3,sort);
		Page<Student> page=stRepo.findAll(pageable);
		page.get().forEach(e ->System.out.println(e));


	}

}
