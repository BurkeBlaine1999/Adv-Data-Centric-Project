package com.lab3.q2;

public class Course {
	private String courseID;
	private String courseName;
	private Lecturer lecturer;
	
	public Course(String courseID, String courseName, Lecturer lecturer) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.lecturer = lecturer;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", lecturer=" + lecturer + "]";
	}	
	
}
