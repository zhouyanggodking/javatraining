package springsample.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("godking")
public class Person {
	private String name;
	
	private String title;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	
	@PostConstruct
	public void init()
	{
		this.name="godking";
		this.title="software engineer";
		System.out.println("in init() func");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("in destroy() func");
	}
	
	public void display()
	{
		System.out.println("displaying godking: name - " + this.name +", title - "+this.title);
	}

}
