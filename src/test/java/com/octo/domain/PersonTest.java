package com.octo.domain;

import junit.framework.Assert;

import org.junit.Test;

import com.octo.domain.Person;

public class PersonTest {

	@Test
	public void shoudBeAGoodPerson() {
		Person person = new Person(42,"Mathieu");
		Assert.assertEquals("Person:id=42,name=Mathieu", person.toString());
	}

}
