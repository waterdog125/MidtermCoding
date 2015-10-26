package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.util.EnumSet;
public class Staff_Test  {




	Staff a = new Staff("Dan","Swag","Man",new Date(1985,4,22), "201 Army Road", "302-853-0696", "danman@aol.com","4-5", 9, 150000.0, new Date(2010, 3,9) , eTitle.ADMINISTRATOR);
	Staff b = new Staff("John","R","Lee",new Date(1985,4,22), "1 Road Road", "302-853-0696", "danman@aol.com","1-2", 9, 250000.0, new Date(2004, 7,4) , eTitle.ADMINISTRATOR);
	Staff c = new Staff("Debbie","Marie","White",new Date(1985,4,22), "2 Dirt Rd", "302-853-0696", "danman@aol.com","3-5", 9, 75000.0, new Date(2012, 8,9) , eTitle.SECRETARY);
	Staff d = new Staff("Steve","S","Monroe",new Date(1985,4,22), "3 Rich Ct", "302-853-0696", "danman@aol.com","2-3", 9, 350000.0, new Date(2006, 3,4) , eTitle.PROFESSOR);	
	Staff e = new Staff("Jimmy","D","Johnson",new Date(1985,4,22), "201 Main St", "302-853-096", "danman@aol.com","1-5", 9, 100000.0, new Date(2002, 9,3) , eTitle.PROFESSOR);

	//Employee Dan = new Employee("UD", 100000.0, new Date(1985,4,22));
	
	
			
			
//			(super("Jimmy", "D", "Johnson",new Date(1985,4,22),
//			"201 Main St", "302-853-096", "danman@aol.com"));
//			Staff[] x = {a,b,c,d,e};
	
			
			
			double Average = 
			(a.getSalary() + b.getSalary() + c.getSalary() + d.getSalary() + e.getSalary())/5;

	//@Tests
	public void test() {
	//	Dan.setPhone("302-853-096");
		assertEquals(185000.0, Average);
//		Exception.PersonException
	}

}
