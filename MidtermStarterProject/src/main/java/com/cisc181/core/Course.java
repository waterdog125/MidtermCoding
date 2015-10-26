package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Course {
public UUID CourseID;
public String CourseName;
public int GradePoints;
public eMajor Major;
public eTitle Title;

public Course(UUID x, String y, int Grade, eMajor major, eTitle Title){
	this.CourseID = x;
	this.CourseName = y;
	this.GradePoints = Grade;
	this.Major = major;
	this.Title = Title;
}
}
