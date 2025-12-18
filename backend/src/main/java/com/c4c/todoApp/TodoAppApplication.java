package com.c4c.todoApp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.c4c.todoApp.dao.AppDAO;
import com.c4c.todoApp.entity.Course;
import com.c4c.todoApp.entity.Instructor;
import com.c4c.todoApp.entity.InstructorDetail;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			// createInstructor(appDAO);

			// findInstructorById(appDAO);

			// deleteInstructor(appDAO);

			// findInstructorDetailById(appDAO);

			// deleteInstructorDetailById(appDAO);

			// createInstructorWithCourses(appDAO);

			// findInstructorWithCourses(appDAO);

			findCoursesForInstructor(appDAO);
		};
	}

	private void findCoursesForInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);

		Instructor tempInstructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);

		// find courses for instructor
		System.out.println("Finding courses for instructor id: " + theId);
		List<Course> courses = appDAO.findCoursesByInstructorId(theId);

		// associate the objects
		tempInstructor.setCourses(courses);

		System.out.println("The associated courses: " + tempInstructor.getCourses());

		System.out.println("Done!");
	}

	private void findInstructorWithCourses(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: " + theId);

		Instructor tempInstructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("The associated courses: " + tempInstructor.getCourses());

		System.out.println("Done!");
	}

	private void createInstructorWithCourses(AppDAO appDAO) {

		Instructor tempInstructor = new Instructor("Susan", "Public", "susan.public@luv2code.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.youtube.com", "video games");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// create some course
		Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
		Course tempCourse2 = new Course("The Pinball Master");

		// add courses to instructor
		tempInstructor.add(tempCourse1);
		tempInstructor.add(tempCourse2);

		// save the instructor
		// NOTE: this will also save the courses
		// because of CascadeType.PERSIST
		System.out.println("Saving the instructor: " + tempInstructor);

		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

	private void deleteInstructorDetailById(AppDAO appDAO) {

		int theId = 3;
		System.out.println("Deleting instructor detail id: " + theId);

		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Deleted instructor detail id: " + theId);

		System.out.println("Done!");
	}

	private void findInstructorDetailById(AppDAO appDAO) {

		// get the instructor detail object
		int theId = 2;
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);

		// print the instructor detail
		System.out.println("tempInstructorDetail: " + tempInstructorDetail);

		// print the associated instructor
		System.out.println("The associated instructor: " + tempInstructorDetail.getInstructor());

		System.out.println("Done!");
	}

	private void deleteInstructor(AppDAO appDAO) {

		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);

		appDAO.deleteInstructorById(theId);
		System.out.println("Deleted instructor id: " + theId);
	}

	private void findInstructorById(AppDAO appDAO) {
		int theId = 2;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("Found instructor: " + tempInstructor);
		System.out.println("The associated instructorDetail: " + tempInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {

		/*
		 * // create the instructor
		 * Instructor tempInstructor = new Instructor("Chad", "Darby",
		 * "darby@luv2code.com");
		 * 
		 * // create the instructorDetail
		 * InstructorDetail tempInstructorDetail = new InstructorDetail(
		 * "http://www.luv2code.com/youtube", "Luv 2 Code!");
		 */

		// create the instructor
		Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@luv2code.com");

		// create the instructorDetail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube", "Guitar");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		//
		// NOTE: this will also save the details object
		// because of CascadeType.ALL
		//
		System.out.println("Saving the instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}
}
