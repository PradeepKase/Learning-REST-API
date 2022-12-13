package com.masai.dao;

import java.util.List;

import com.masai.exception.GymException;
import com.masai.exception.TrainerException;
import com.masai.model.Gym;
import com.masai.model.Person;
import com.masai.model.Trainer;

public interface FitnessDao {
	
	public void addGym(Gym gym);
	
	public void registerPerson(Person person, int gym_id)throws GymException;
	
	public void registerTrainer(Trainer trainer);
	
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
	
	List<Person> getAllthePersonByGymName(String gym_name)throws GymException;

}
