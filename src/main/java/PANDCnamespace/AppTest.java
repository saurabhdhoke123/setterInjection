package PANDCnamespace;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	 public static void main( String[] args )
	    {
	        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("PANDCnamespace/application-context.xml"));
	car c=        bf.getBean("car",car.class);
	System.out.println(c);
	    }
}
