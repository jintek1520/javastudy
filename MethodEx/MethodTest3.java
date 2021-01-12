package com.naver;

import kr.co.ezen.Dog;
import kr.co.ezen.Test12;

public class MethodTest3 {

	public MethodTest3() {
		// TODO Auto-generated constructor stub
	
	}
	public Test12 getTest12() {
		
		return new Test12();
	
	}
	public boolean getBoolean() {
	
		return false;
	}

	public char getChar() {
		return 'A';
		
	}

	public byte getByte() {
		return 120;
	}

	public short getShort() {
		return 129;
		
	}

	public int getInt() {
		return 2140000000;
		
	}
	public long getLong() {
		return 2140000000000L;
		
	}
	public float getFloat() {
		return 2.88f;
		
	}
	public double getDouble() {
		return 3.12;
	}
	
	// ÂüÁ¶ÀÚ·áÇü Dog ¿¹½Ã ¹®Çü
	public Dog getDog() {
		return new Dog();
	}


}