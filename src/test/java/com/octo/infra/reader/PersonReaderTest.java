package com.octo.infra.reader;

import junit.framework.Assert;

import org.junit.Test;

import com.octo.domain.Person;
import com.octo.infra.reader.PersonReader;

public class PersonReaderTest {

	@Test
	public void shouldReadABigArrayWithAHundredOfPerson() {
		PersonReader reader = new PersonReader();
		
		
		Person person = reader.read();
		
		
		Assert.assertNotNull(reader.read());
	}

}
