package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContextObj = new ClassPathXmlApplicationContext("beans.xml");

		Student obj = (Student) applicationContextObj.getBean("Student");
		System.out.println("The student object values are " + obj);

	}
}
