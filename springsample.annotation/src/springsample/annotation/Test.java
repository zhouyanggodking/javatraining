package springsample.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Person p = context.getBean("godking", Person.class);
		
		p.display();
		
		//for destroy method in bean life cycle
		context.registerShutdownHook();
	}

}
