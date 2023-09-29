import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dogdriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Dog d = ac.getBean(Dog.class);
		System.out.println(d);
		System.out.println(d.breed);
		System.out.println(d.name);
		System.out.println(d.height);
	}

}
