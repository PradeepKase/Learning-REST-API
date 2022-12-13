package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.GymException;
import com.masai.exception.TrainerException;
import com.masai.model.Gym;
import com.masai.model.Person;
import com.masai.model.Trainer;
import com.masai.util.EMUtil;

public class FitnessDaoImpl implements FitnessDao{

	@Override
	public void addGym(Gym gym) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provedEntityManager();
		
		em.getTransaction().begin();
		em.persist(gym);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("done");
		
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provedEntityManager();
		
		Person p = em.find(Person.class, gym_id);
		
		if(p == null) {
			
			throw new GymException("not found");
		}
		
		
		em.getTransaction().begin();
		
		em.persist(person);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		System.out.println("done");
		
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provedEntityManager();
		
		em.getTransaction().begin();
		em.persist(trainer);
		
		em.getTransaction().commit();
		
		em.close();
		

		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.provedEntityManager();
		
		Gym gym = em.find(Gym.class, gym_id);
		
	   Trainer t = 	 em.find(Trainer.class, trainer_id);
		
		
		if(gym == null) {
			em.close();
			
			throw new GymException("not found");
		}
		
		if(t == null) {
			em.close();
			
			throw new TrainerException("not found");
		}
		
		
		em.getTransaction().begin();
		
		gym.getGym().add(t);
		
	     t.setTrainer_id(trainer_id);
	     
	     em.getTransaction().commit();
	     
	     em.close();
		
		
		
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provedEntityManager();
		
		String jpql = "select from gym where gymName = ?1";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter(1, gym_name);
		
		Object obj = q.getResultList();
		
		List<Person> list =  ( List<Person>) obj;
		
		if(list.size() == 0) {
			throw new GymException("invailid ");
		}
		
		
		return list;
		
		
		
		
		
		
		return null;
	}

}
