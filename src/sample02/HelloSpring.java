package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//생성자 방식
		Calc calc = (Calc)applicationContext.getBean("calcAdd");
		calc.calculate();
		//세터 방식
		calc = applicationContext.getBean("calcMul",Calc.class);
		calc.calculate();
	}
}
