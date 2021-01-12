package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public void me5(String filename) {
		// 1. map 객체를 만듬
		// 단 K: String, V: <String>
		Map<String, String> map = new HashMap<String, String>();

		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		// 그 외는 시스템 파일

		int idx = filename.lastIndexOf(",");
		// png
		String key = filename.substring(idx + 1);// +1은 .을 제외하기 위해서
		// key.toLowerCase(): map의 key가 모두 소문자로 되어 있어서.
		String msg = map.get(key.toLowerCase());

		if (msg == null) {// map에 없는 key를 입력하면 value를 null로 반환함.
			System.out.println("시스템파일");
		} else {
			System.out.println(msg);
		}

	}

	public void me4() {
		// Dog정렬이 될 수 있게 Comparable ㅇ구현

		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();

		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("doo1", "누렁이", "진도인", 3));
		list1.add(new Dog("doo2", "백구", "진도인2", 4));

		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("doo3", "happy", "독일인1", 5));
		list2.add(new Dog("doo4", "타로", "독일인2", 6));

		map.put("진돗개", list1);
		map.put("셰퍼트", list2);

		// 1. map 객체를 만듬
		// 단 K: List<Dog>, V: <String>
		List<Dog> jin = map.get("진돗개");
		System.out.println(jin);
		List<Dog> Se = map.get("셰퍼트");
		System.out.println(Se);

	}

	public void me3() {
		// 1. map 객체를 만듬
		// 단 K: String, V: List<String>
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandure");

		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");

		map.put("현대차", list1);
		map.put("기아차", list2);

		List<String> hc = map.get("현대차");
		System.out.println(hc);

		List<String> kc = map.get("기아차");
		System.out.println(kc);

	}

	public void me2() {
		// 1. map 객체를 만듬
		// 단 K: Integer, V: <String>

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park"); // 기존, "kim" > "kang"으로 변경
		map.put(1, "kang");

		String name = map.get(1);
		System.out.println(name);

		String name2 = map.get(0);
		System.out.println(name2);

		String name3 = map.get(1);
		System.out.println(name3);
	}

	public void me1() {
		// Map, HashMap
		// map객체를 만드시오.
		// 다단, key: String, Value : Integer

		Map<String, Integer> map = new HashMap<String, Integer>();

		// map에 데이터를 넣으시오
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산과의 거리", 300);

		Integer name = map.get("중력가속도");
		System.out.println(name);

		Integer name2 = map.get("우리집 비밀번호");
		System.out.println(name2);

		Integer name3 = map.get("서울과 부산과의 거리");
		System.out.println(name3);

	}
}