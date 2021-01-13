  
package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {
		a = 4;
		b = 11;
	}
	
	public void cond5(int score) {
		char c = score >=90?  'A' 
			: score >=80?  'B'
				: score >=70 ?  'C'
					: score >=60 ? 'D'
							: 'F';
					
	}
	
	
	public void cond4() {
		int c = a > b*2 ? me1() : a;
		System.out.println(c);
	}
	
	public void me2 () {
		System.out.println(44);
	}
	
	
	public int me1() {
		return 3;
	}
	
	public void con3() {
		StringBuffer c = a<=b ? new StringBuffer( "hello") : new StringBuffer("no");
		
		System.out.println(c);
		}

		
	public void con2() {
		
	String c = a!=b ? "hello" : "no";
	System.out.println(c);
	}
	public void con1() {
		char c = a>=b ?'a' :'z';
		System.out.println(c);
							}
		
	}