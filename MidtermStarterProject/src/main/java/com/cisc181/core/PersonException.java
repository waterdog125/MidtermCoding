package com.cisc181.core;
import java.util.regex.*;
import java.util.Calendar;

public class PersonException extends Exception {
	public Person person;

	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

	Pattern pattern = Pattern.compile(regex);

	public  PersonException() throws Exception{


		if (this.person.getDOB().getYear() >= Calendar.YEAR)

			throw new Exception("DOB is  greater than 100 years.");
		if (this.person.getPhone().matches(regex) == false)
			throw new Exception("Phone number is not in correct format.");
		
	}}

