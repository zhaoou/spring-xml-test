import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bread;
import beans.Sandwich;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context_config.xml");
		
		// bean name, 'baseballGame' comes from the component class name
		//Bread bread = context.getBean("ryeBread",Bread.class);
		Sandwich sandwich = context.getBean("sandwich", Sandwich.class);
		System.out.println(sandwich.makeSandwich());
		
		System.out.println(context.getBeanDefinitionCount());
		for(String beanName: context.getBeanDefinitionNames())
			System.out.println(beanName);
	}

}
