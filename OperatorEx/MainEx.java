package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		boolean result =t1.me1(3, 4);
		System.out.println(result);
		
		
		result =t1.me2(300L, 400L);
		System.out.println(result);
		

		t1.me31(3, 2);
		
		t1.me4((byte)1, (byte)1);
		byte a = 1;
		byte b = 1;
		t1.me4(a, b);
		
		//t1.me4((byte)3,(byte)5);
		
		short f = 1;
		short g = 2;
		
		t1.me5(f, g);
		
		t1.me51((byte)3,(byte) 5);
		byte u = 1;
		byte c = 2;
		t1.me51(u, c);
		
		t1.me6(true, false);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Test2 t2 = new Test2();
		t2.k1(true, true); //t
		t2.k1(true, false); //f
		t2.k1(false, true); //f
		t2.k1(false, false); //f
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>oror");
		t2.k2(true, true); // t
		t2.k2(true, false); // t
		t2.k2(false, true); // t
		t2.k2(false, false); //f
	
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		t2.k3(true); //f
		t2.k3(false); //t
		
		boolean e = false;
		t2.k3(e); //true
		
		System.out.println("#################################");
		Test3 t3 = new Test3();
		t3.plus1 ();
		t3.plus11();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		t3.plus2(); // 0 1 
		t3.plus21(); // 1
		t3.plus22(); // 2
		t3.minus1(); // 1
		System.out.println("^^^^^^^^^^^^$$$$^^^^^^^^^^^^^^");
		Test4 t4 = new Test4();
		t4.con1(); 
		
		t4.con2();
		t4.con3();
		t4.cond4();
		t4.cond5(80);
		
		System.out.println("^^^^^^^^^^^^^%%%%%%^^^^^^^^^^^^^^");
		Test5 t5 = new Test5();
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		t5.h5(0);
		t5.h5(1);
		t5.h5(2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^$");
		
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		t5.h6(3);
		t5.h6(4);
	}	
}