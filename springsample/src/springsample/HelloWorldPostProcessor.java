package springsample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//this class should be injected and specified in beans.xml
public class HelloWorldPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("currently in postProcessAfterInitialization of hello world");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("currently in postProcessBeforeInitialization of hello world");
		return bean;
	}

}
