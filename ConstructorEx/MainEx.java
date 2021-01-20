package kr.co.ezen;

public class MainEx {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.me1();
		
		Test1 t2 = new Test1();
		t2.me1();
		
		Test1 t3 = new Test1(34L);
		 t3.me1();
		//şŻźö¸í = °´Ăź¸í = ˇšĆŰˇą˝ş
		Test1 t4 = new Test1(11, 22);
		t4 = new Test1();

		t4.me1();
		
		person kim0 = new person("s01","Kim",44,"seoul","lec",new Dog(),null);
		
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getAddress());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		kim0.setSsn("s01");
		kim0.setName("kim");
		kim0.setAge(44);
		kim0.setAddress("seoul");
		kim0.setJob("lec");
		kim0.setDog(new Dog());
		kim0.setCar(null);
		
		person kim1 = new person("s01","Kim",44,"seoul","lec",new Dog(),null);
		
		System.out.println(kim1.getDog().getName()); //
		Dog d1 = kim1.getDog();
		String name = d1.getName();
		System.out.println(name);
		
		System.out.println(kim1.getSsn());
		System.out.println(kim1.getName());
		System.out.println(kim1.getAge());
		System.out.println(kim1.getAddress());
		System.out.println(kim1.getJob());
		System.out.println(kim1.getDog());
		System.out.println(kim1.getCar());
		
		kim1.setSsn("s01");
		kim1.setName("kim1");
		kim1.setAge(43);
		kim1.setAddress("seoul");
		kim1.setJob("lec");
		kim1.setDog(new Dog());
		kim1.setCar(null);	
	}		
}