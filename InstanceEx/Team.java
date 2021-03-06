package com.nate;

import kr.co.ezen.Dog;
import com.naver.Car; //
import com.naver.Person; // Dog 클래스 호출

public class Team {
	private Person captain;
	private Person member1;
	private Person member2;

	public Team() {

	}//

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;

	}//

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}

	public void fight(Team bTeam) {
		String aTeamCaptainName = this.captain.getName();
		String bTeamCaptainName = bTeam.captain.getName();
		System.out.println(captain + "과 " + bTeam + "이 싸웁니다.");
	} // #1

	public void fightMem1(Team otherTeam) {
		String mem1 = this.member1.getName();
		String otherMem1 = otherTeam.member1.getName();
		System.out.println(mem1 + "과" + otherMem1 + "이 싸웁니다.");

	} // #2

	public void fightMem2(Team otherTeam) {
		Dog dog = this.member2.getHappy();
		String dogName = dog.getName();
		Dog otherDog = otherTeam.member2.getHappy();
		String otherDogName = otherDog.getName();

		System.out.println(dogName + "과(와)" + otherDogName + "가(이) 개싸움을 합니다.");

	} // #3

	public void fightMem2Car(Team otherTeam) {
		Car car = this.member1.getK7();
		String carNo = car.getCarNo();

		Car otherCar = otherTeam.member1.getK7();
		String otherCarNo = otherCar.getCarNo();

		System.out.println(carNo + "과(와)" + otherCarNo + "가(이) 자동차 경주를 합니다.");

	} // #4

	public void showCaptainCarPrice(int price) {
		Car captainCar = captain.getK7();
		captainCar.showMePrice();
	} // #5

	public void mem1Sleep(String where) {
		String msg = member1.getHappy().sleep("방");
		// .메서드명().메서드명() 호출
		// System.out.println(member1.getHappy().sleep("방"));
	} // #6

	public void mem2carNo(String carNo) {
		String carNum = member2.getCarNo();

		System.out.println(member2.getCarNo("가 1520"));

	} // #7

	public void mem2CarModelName() {

		Car car = member2.getK7();
		String modelName = car.getModelName();
		System.out.println(modelName);

	} // #8

	public char getCaptainCarModelNameFirstChar() {
		Car car = captain.getK7();
		String modelName = car.getModelName();
		return modelName.charAt(0);
	} // #9

	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
	} // #10

	public void changeMem1DogName(String dogName) {
		Dog dog = member1.getHappy();
		dog.setName(dogName);
		// member1.getHappy().setName(dogName)

	} // #11

	public void fightMem2Dog(Team otherTeam) {
		// TODO Auto-generated method stub
		Dog dog = this.member2.getHappy();
		String dogName = dog.getName();
		otherTeam.member1.getHappy();
		String dogName1 = dog.getName();

		System.out.println(dogName + "과" + dogName1 + "이 개싸움을 합니다.");

	} // #12

	public void fightMem3(Team otherTeam) {
		// TODO Auto-generated method stub

	}

	private void getCarNo() {
		// TODO Auto-generated method stub

	}

}