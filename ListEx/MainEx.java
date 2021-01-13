package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		//t1.me1();
		t1.me2();
		List<MemberDTO> list= t1.me7();
		
		System.out.println(":::::::::");
		t1.me5();
		System.out.println("11111111");
		t1.me6();
		
		MemberDTO dto = list.get(1);
		String name = dto.getName();
		System.out.println(name);
		t1.me8();
		}

}