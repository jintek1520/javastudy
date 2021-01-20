package com.naver;



public class CarRegistManagementService {
	
	private String carName; //접근 제한자 자료형 변수명

	public CarRegistManagementService() {
		carName = "소나타";
	}

	public void setCarName(String carName) {
        this.carName = carName;
	} //무반환 유파람
	
	public String getCarName() {
		return carName;
	}
	
	public long add(int a,int b) {
		return (long)a+b;} 
	
	public int getCountCarName(String carName) {
		
		int size =carName.length();
		
		return size;} // 유반환 유파람

	public long add1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public long add(long l, int b) {
		// TODO Auto-generated method stub
		return 0;
	}