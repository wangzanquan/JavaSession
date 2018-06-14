package com.javasession.week.two.oop;

public class Student extends Dept {
	String mainSubject = "Math";
	public static void main(String[] args) {
		Student dp = new Student();
		System.out.println(dp.designation);
		System.out.println(dp.nameOfDept);
		System.out.println(dp.mainSubject);
	}
}

//inner class
class Dept{
	
	String designation = "tutor";
	String nameOfDept = "Tech";
	
	void does() {
		System.out.println("teaching");
	}
	
}
