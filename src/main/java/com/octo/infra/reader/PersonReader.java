package com.octo.infra.reader;

import org.springframework.batch.item.ItemReader;

import com.octo.domain.Person;

public class PersonReader implements ItemReader<Person> {

	static Person[] persons = new Person[100];
	
	static {
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person(i,"name" + i);
		}
	}
	
	static int index = 0;

	public Person read() {
		if(index < persons.length) {
			Person result = persons[index];
			index++;
			return result;
		}
		return null;
	}

}
