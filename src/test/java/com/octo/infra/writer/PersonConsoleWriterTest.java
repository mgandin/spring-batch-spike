package com.octo.infra.writer;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.octo.domain.Person;
import com.octo.infra.writer.PersonConsoleWriter;

public class PersonConsoleWriterTest {

	@Test
	public void shouldWriteAPersonInTheConsole() throws Exception {
		PersonConsoleWriter writer = new PersonConsoleWriter();
		Person person = new Person(42,"Mathieu");
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person);
		writer.write(persons);
		
		Assert.assertEquals("Person:id=42,name=Mathieu\nPerson:id=42,name=Mathieu\n", writer.buffer.toString());
	}

}
