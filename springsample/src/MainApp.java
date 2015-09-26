import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springsample.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person p = (Person) context.getBean("godking");
		System.out.println(p.getName());
		System.out.println(p.getTitle());
	}

}
