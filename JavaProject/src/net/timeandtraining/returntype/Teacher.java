package net.timeandtraining.returntype;

public class Teacher {
	
	
	public int gradeStudent() {
		return 100;
	}
	
	public String giveAbook() {
		return "Java Tutorial";
	}
	
	public Student callOneStudent() {
		return new Student();
	}
	
	public School getSchool() {
		return new School();
	}
	
}
