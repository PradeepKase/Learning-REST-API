package assaignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class Bike implements Vehicle {
	
	public void ride() {
		System.out.println("ride started....");
		}

	
	
	@Override
	public void go() {
		// TODO Auto-generated method stub
		ride();
	}

}
