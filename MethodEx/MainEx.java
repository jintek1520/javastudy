package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.DogRegistManagementService;

public class MainEx {

	public static <add> void main(String[] args) {
		
		CarRegistManagementService crms= new CarRegistManagementService();
	
			crms.setCarName("K7");
			
			String setCarName = crms.getCarName();
			System.out.println(crms.getCarName());
		
			
		CarRegistManagementService crms2= new CarRegistManagementService();
		long result = crms2.add(2500000000L,2100000000) ;
		
				System.out.println(result); // 0 ?
				
				DogRegistManagementService drms = new DogRegistManagementService();
				// 참조자료형 
				Dog md = drms.makeDog("happy", 23);
				System.out.println(md); // 변수 md의 주소값
				
				System.out.println(md.getName());
			    System.out.println(md.getAge());
			    
	}
	
}