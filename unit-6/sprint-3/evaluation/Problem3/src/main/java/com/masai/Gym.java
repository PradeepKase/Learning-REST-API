package com.masai;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class Gym {
	

//@Value("1")
private int	gym_id;
//@Value("starGym")
private String	gym_name;
//@Value("500")
private int	monthly_fee;

//public Gym(int i, String string, int j) {
//	// TODO Auto-generated constructor stub
//}
public Gym() {
	
}

public Gym(int gym_id, String gym_name, int monthly_fee) {
	super();
	this.gym_id = gym_id;
	this.gym_name = gym_name;
	this.monthly_fee = monthly_fee;
}


@Override
public String toString() {
	return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
}

}
