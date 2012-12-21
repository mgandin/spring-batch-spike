package com.octo.infra.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.octo.domain.Person;

public class PersonConsoleWriter implements ItemWriter<Person> {

	protected StringBuffer buffer;
	
	public PersonConsoleWriter() {
		this.buffer = new StringBuffer();
	}

	@Override
	public void write(List<?extends Person> persons) throws Exception {
		for (Person person : persons) {
			this.buffer.append(person + "\n");
			System.out.println(person);
		}
		
	}

	

}
