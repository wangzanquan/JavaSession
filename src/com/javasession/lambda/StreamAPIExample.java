package com.javasession.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList
				(new Person("Charles", "Dickens", 60),
				 new Person("Lwis", "Carrol", 42),
				 new Person("Thomas", "Caryle", 51),
				 new Person("Charlotte", "Bronte", 45),
				 new Person("Mathew", "Arnold", 39)
						);
		
		//STREAM WAY
		people.stream().forEach(anyNameRepresentPeople -> System.out.println(anyNameRepresentPeople.getLname()));
		
		//Print certain name
		people.stream().filter(foo -> foo.getFname().startsWith("C")).forEach(foo -> System.out.println(foo.getFname()));
		
		
		
		/*for(Person p: people) {
			System.out.println(p);
		}
		
		//Print first name
		for(Person p1: people) {
			System.out.println(p1.getFname());
		}
		
		//Print age
		for(Person p2: people) {
			System.out.println(p2.getAge());
		}*/
		
	}
}
