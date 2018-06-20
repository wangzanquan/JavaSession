package com.assignment.callSuperConstructor;

public class SubClass extends SuperClass {
	private int id;
	
	public SubClass() {
		super();
	}
	public SubClass(String name) {
		super(name);
		
	}
	
	void setID(int id) {
		this.id = id;
	}
	int getID() {
		return this.id;
	}
	
	

	@Override
	public void testAbstractMethod() {
		System.out.println("From abstract method");
		
	}
	/*
	 * Why cannot call set or get id?
	 */
	public static void main(String[] args) {
		SuperClass obj = new SubClass("Tony");
		
		/*
		 * Abstract class cannot be instantiated.
		 */
		//SuperClass obj2 = new SuperClass();//?!?!?!?!
		
		
		
	}

}

abstract class SuperClass{
	private static int counter;
	private String name;
	private int age;
	
	SuperClass(){
		this.counter++;		
	}
	
	SuperClass(String name){
		this();
		this.name = name;
	}
	
	SuperClass(String name, int age){
		this(name);
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	
	/*
	 * Why if comment this abstract method, it can sill compile?!
	 */
	public abstract void testAbstractMethod();
	
	
}
