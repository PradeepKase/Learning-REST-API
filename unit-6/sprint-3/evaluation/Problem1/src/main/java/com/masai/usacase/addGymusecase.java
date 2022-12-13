package com.masai.usacase;

import java.util.Scanner;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exception.GymException;
import com.masai.exception.TrainerException;
import com.masai.model.Gym;

public class addGymusecase {

	public static void main(String[] args) throws TrainerException, GymException {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("entr gym_name");

		String gym_name = sc.next();

		System.out.println("entr monthly_fee");

		int monthly_fee = sc.nextInt();

		

		FitnessDao f = new FitnessDaoImpl();
		
		f.assignTrainerWithGym(monthly_fee, monthly_fee);
	
		
	}

}
