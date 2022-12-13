package assaignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
     Travel tr=ctx.getBean(Travel.class);
     tr.journey();
     ((AbstractApplicationContext) ctx).close();
}
}
