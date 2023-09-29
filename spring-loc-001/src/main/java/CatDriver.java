import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CatDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Cat c = (Cat) ac.getBean("c");
		System.out.println(c);
		
//		Dog d = (Dog) ac.getBean("d");
//		System.out.println(d);
		
		Cat c1 = (Cat) ac.getBean("c");
		System.out.println(c);
		
		
		ClassPathResource cpr = new ClassPathResource("spring.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Dog d = (Dog) bf.getBean("d");
		System.out.println(d);

	}

}
