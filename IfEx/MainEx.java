package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.me1();
		t1.me2(60);
		t1.me3(8);
		
		String msg=t1.me4(11);
		System.out.println(msg);
		
		
		t1.me5(2);
		t1.me6(191);
		t1.me7(22);
		
		TV tv1 = new TV(10, 15, false);
		
		tv1.PowerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.PowerDown();
		System.out.println(tv1.getCh());
		tv1.volUp();
		System.out.println(tv1.getCh());
		
		
		Person kim = new Person();
		
		kim.tvOn();
		kim.tvOff();
		//kim의 tv볼륨을 +1 시키시오.
		kim.tvOn();
		
		TV tv = kim.getTv1();
		System.out.println(tv.getCh());
		tv.chUp();
		System.out.println(tv.getCh());
		//kim의 tv 볼륨을 -1 시키시오
		
		TV tv3 = kim.getTv1();
		
		System.out.println(tv.getCh());
		
		tv.chDown();
		System.out.println();
		
	//kim의 tv볼륨을 50으로 설정하시오
	//TV tv5 = kim.getTv1().setVol(50);
		
	}

}