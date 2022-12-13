package com.masai;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
@Controller
public class PersonService {
	@Autowired
	private Map <Person,Gym> themap;
	@Autowired
	private List<Person> theList;
	@Value("cultfit")
	private String appName;
	
	
	public void printMap(){
		//print all the person's and their gym details from the Map
		System.out.println(themap);
		}

	public void printList(){
		//sort the List of Person according to the increasing order of the age 
		//print all the sorted Person Details
		System.out.println(theList);
		}

		public void printAppName(){
		//print the injected appName
			System.out.println(appName);
		}
}
