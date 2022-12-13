package assaignment;

import org.springframework.stereotype.Repository;

@Repository
public class Car implements Vehicle { // dependency class
	public void start() {
		System.out.println("Car started...");
		}

@Override
public void go() {
	// TODO Auto-generated method stub
	start();
}

}
