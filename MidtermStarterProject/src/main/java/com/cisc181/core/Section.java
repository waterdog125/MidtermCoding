package com.cisc181.core;

import java.util.UUID;

public class Section {
public UUID CourseID;
public UUID SemesterID;
public UUID SectionID;
public int RoomID;

public Section(UUID x, UUID y, UUID z, int room){
	this.CourseID = x;
	this.SemesterID = y;
	this.SectionID = z;
	this.RoomID = room;
}
}
