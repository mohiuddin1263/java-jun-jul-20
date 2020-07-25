package net.timeandtraining.loops;

import net.timeandtraining.returntype.School;
import net.timeandtraining.returntype.Student;
import net.timeandtraining.returntype.Teacher;

public class LoopDemo {

	public static void main(String[] args) {

		Teacher myTeacher = new Teacher();
		
		
		int x = myTeacher.gradeStudent();
		System.out.println(x);
		
		String book = myTeacher.giveAbook();
		System.out.println(book);
		
		Student student1 = myTeacher.callOneStudent();
		
		student1.study();
		
		
		Student s = new Student();
		s.study();
		
		
		School mySchool = myTeacher.getSchool();
		
		
		
	}

}
