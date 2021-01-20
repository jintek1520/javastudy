package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();

		t1.me1();
		System.out.println("<<<<<<<<<<<<<<");
		t1.me11();
		System.out.println("|||||||||||||||||||||||");
		t1.me2();
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		t1.me21();
		System.out.println("");
		t1.dan(1);

		t1.dan(9);
		t1.gugudan();

		t1.me3();
		System.out.println(" <<<<<<<<<<<<<<<<<<<<");
		t1.me31(5);
		System.out.println(" <<<<<<<<<<<<<<<<<<<<<<");

		t1.me5_8();
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVV");
		t1.prinStar(3);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
		t1.piboNa();

		t1.me5();
		t1.me4();
	}
}