package com.naver;

public class Car { //member 변수 , 생성자, 메서드
	private String modelName;
	private String carNo;
	private int price;
	
	public Car() {
		
	}

	public Car(String modelName, String carNo, int price) {
		super(); // 조상 클래스 오버라이딩 : 메서드 상속받아서 재정의
		this.modelName = modelName;
		this.carNo = carNo;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void showMeModelName() {
		System.out.println(modelName);
	}
	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public void showMeCarNum(){
		System.out.println(carNo);
		
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 
	public void showMePrice() {
		System.out.println(price);
	}
	
	public String run(int speed) {
		String msg = speed + "로 달린다.";
		return msg;
	}
	
	
}