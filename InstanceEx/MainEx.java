package kr.co.ezen;



import com.naver.Car;

import com.naver.Person;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;


public class MainEx {
	
	public static void main(String[] args) {
		Car car1 = new Car("K7","1",4000);
		//car1.showMePrice();
		Car car2 = new Car("bmw","2",5000);
		Car car3 = new Car("sm5","3",4000);
		
		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3, "백구", new Date(Calendar.getInstance().getTimeInMillis()));
		
		Person captain = new Person("p1", "주장", dog1, car1); //
		Person member1 = new Person("p2", "김유신", dog2, car2); // 
		Person member2 = new Person("p3", "이순신",dog3, car3 );
		 
		
		// Team class 이용하여,aTeam 객체를 만드시오.
		//단, 생성자에 들어가는 파라미터는 위에 선언된 변수를 이용하시오 
		Team aTeam = new Team(captain, member1, member2);
		
		
		Car car4= new Car("K5","4",4000);
		//car1.showMePrice();
		Car car5 = new Car("벤츠","5",5000);
		Car car6 = new Car("sm3","6",4000);
		
		Dog dog4 = new Dog(4, "황구",new Date( ));
		Dog dog5 = new Dog(5, "땡칠이",new Date());
		Dog dog6 = new Dog(6, "흑구",new Date());
		
		Person captain2= new Person("p4", "주장", dog4, car4);
		Person member3 = new Person("p5", "김유신", dog5, car5);
		Person member4 = new Person("p6", "이순신",dog6, car6 );
		
		Team otherTeam = new Team(captain2,member3,member4);
		
		aTeam.fight(otherTeam);
		
		otherTeam.fight(aTeam);
		
		aTeam.fightMem2Dog(otherTeam);
		
		aTeam.fightMem2Car(otherTeam);
		Person.run();
		
	}
}