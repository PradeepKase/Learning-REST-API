package dummy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo2 {
public static void main(String[] args) {
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	College clg=app.getBean("c",College.class);
	clg.showDetails();
	
}
}
