package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
public UUID SemesterID;
public Date StartDate;
public Date EndDate;


public Semester(UUID id, Date start, Date end){
	this.SemesterID = id;
	this.StartDate = start;
	this.EndDate = end;
}
}
