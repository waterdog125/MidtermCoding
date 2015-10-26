package com.cisc181.core;

import java.util.UUID;

public class Enrollment<StudentID> {
public UUID SectionID;
public UUID StudentID;
public UUID EnrollmentID;
public double Grade;

private Enrollment() {
	
}
public Enrollment(UUID StudentID,UUID SectionID)
{
	this.EnrollmentID = EnrollmentID;
}

public void setID(UUID ID){
	this.EnrollmentID = ID;
}

public void SetGrade(double grade)
{
	this.Grade= grade;
}
}
