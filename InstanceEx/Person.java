package com.naver;

import kr.co.ezen.Dog;

public class Person {		
	private String id;
	private String name;
	private Dog happy;
	private Car k7;
		
	

	public Person() {
		
	}
	

	public Person(String id, String name, Dog happy, Car k7) {
		super();
		this.id = id;
		this.name = name;
		this.happy = happy;
		this.k7 = k7;
	}

	
	public void printNameFirst() {
		System.out.println(name.charAt(0));
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getHappy() {
		return happy;
	}

	public void setHappy(Dog happy) {
		this.happy = happy;
	}

	public Car getK7() {
		return k7;
	}

	public void setK7(Car k7) {
		this.k7 = k7;
	}
	public void sleep(String where) {
//		String msg = happy.sleep(where);
//		System.out.println(msg);	
		
		System.out.println(happy.sleep(where));
	}
	
	public void run(int speed) {
		String msg=k7.run(speed);
		System.out.println(msg);
	
		//System.out.println(k7.run(speed));
	}
	
	public void showMeprice(int price) {
		k7.showMePrice();
		System.out.println(price);
	
	}

	public static void run() {
		// TODO Auto-generated method stub
		
	}


	public String getCarNo() {
		// TODO Auto-generated method stub
		return null;
	}


	public char[] getCarNo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	





	
	
}