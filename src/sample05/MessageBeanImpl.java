package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MessageBeanImpl implements MessageBean {

	private String name;
	private String phone;
	private Outputter outputter;//여기없으니 참조되는거부터읽고 나머지 읽는다.
	
	public MessageBeanImpl() {
		System.out.println("MessageBeanImpl의 기본 생성자");
	}
	

	public MessageBeanImpl(String name) {
		System.out.println("public messageBeanImpl(String name)"); //메소드 호출되는지 확인하는것.
		this.name = name;
	}

	public void setPhone(String phone) {
		System.out.println("public void setPhone(String phone)");
		this.phone = phone;
	}

	public void setOutputter(Outputter outputter) {
		System.out.println("public void setOutputter(Outputter outputter)");
		this.outputter = outputter;
	}

	@Override
	public void helloCall() {
		System.out.println("public void helloCall()");
		System.out.println("나의 이름은 " + name + "핸드폰은 "+ phone);
	}

}
