package assaignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Service
@Scope("prototype")
public class Travel {  //dependent class
// here both are tightly coupled eachother
//	Car c=new Car();
	
	//it is user defined  object type dependency
	@Autowired
	@Qualifier("bike") 
	private Vehicle v; //here we can store one of its implemented class obj.
	// simple value type dependency
	@Value("1")
	private int No_person;
	
	
	//constructor injection point
//	public Travel(Vehicle v) {
//	this.v=v;
//	}
	
	//setter injection point
//	public void setNo_person(int no_person) {
//		No_person = no_person;
//	}


	//setter injection point
//	public void setV(Vehicle v) {
//	this.v=v;
//	}

	@PostConstruct
	public void destory() {
		System.out.println("post constuct");
	}
	
	@PreDestroy
	public void kills() {
		System.out.println("pre destroy");
	}
	
	
//	Bike b=new Bike();
	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
		System.out.println("no_person"+ No_person);
	}
	
}

