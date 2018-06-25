package com.javasession.lambda;

public class Person implements Comparable<Person>{
	private String fname;
	private String lname;
	private int age;
	
	/*
	 * 1. Sort List by last name
	 * 2. Create method that can print all the element in the list
	 * 3. Create method that print person with only last name starts with 'N'
	 */
	
	public Person(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		int last = this.lname.compareTo(p.lname);
		return last == 0 ? this.fname.compareTo(p.fname) : last;
	}
	
	
	
	
}
