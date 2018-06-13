package com.javasession.week.two.oop;

public class AbstractionsSample {
	private static int num = 10;
	private String str = "test";
	

	
	public static int getNum() {
		return num;
	}



	public static void setNum(int num) {
		AbstractionsSample.num = num;
	}



	public String getStr() {
		return str;
	}



	public void setStr(String str) {
		this.str = str;
	}



	public static void main(String[] args) {
		AbstractionsSample ab = new AbstractionsSample();
		ab.setNum(20);
		System.out.println((int)ab.getNum());
	}
}
