package inc.codeman.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inc.codeman.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inc/codeman/spring/springaop/test/config.xml");
		ProductService bean = (ProductService)context.getBean("productService");
		System.out.println(bean.multiply(10, 12));
	}

}
