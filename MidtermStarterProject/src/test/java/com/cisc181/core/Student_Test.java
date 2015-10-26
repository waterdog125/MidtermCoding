package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	
//	Course Math = new Course(new UUID(), "Calc", 100, new eMajor(), new eTitle());
public UUID  Math242;
public eMajor major;
public eTitle title;


Course Math = new Course(Math242, "Calc", 100, major, title);
Course Science = new Course(Math242, "Bio", 100,major, title);
Course Algebra = new Course(Math242, "Algebra", 100,major, title);
Semester Spring = new Semester(Math242, new Date(1995, 10, 20), new Date(1997, 9, 14));
Semester Fall = new Semester(Math242, new Date(1995, 10, 20), new Date(1997, 9, 14));
Section a = new Section(Math242, Math242, Math242, 4);
Section b = new Section(Math242, Math242, Math242, 5);
Section c = new Section(Math242, Math242, Math242, 6);
Section d = new Section(Math242, Math242, Math242, 7);
Section e = new Section(Math242, Math242, Math242, 8);
Section f = new Section(Math242, Math242, Math242, 9);

//Person aa = new Student();


Semester[] semesters = {Spring, Fall};
Section[] sections = {a,b,c, d, e, f};
Course[] set = {Math, Science, Algebra};

	@Test
	public void test() {
	
	}

}
