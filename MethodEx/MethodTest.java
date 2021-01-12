package kr.co.ezen;

public class MethodTest {
	
	//public , protected, 디폴트 , private 접근제한자 
	
	int a;
	boolean b = true;
	
	
	public MethodTest(){
	
	
	}
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	public void stand() {
		
		System.out.println("무반환, 무파람");
		
		
	}
	public void sleep() { 
		System.out.println("public : 접근제한자로 프로젝트 전체에서 sleep메서드가 호출될 수 있음을 의미함.");
		System.out.println("void: 반환형이라 하고,이는 반환되는 데이터가 없다는 것을 의미한다.");
		System.out.println("sleep: 메서드의 이름이고, 나중에 메서드를 호출 할 때 그 이름을 적어 줌으로써 메서드 본문 안에 있는 코드를 실행하게 함.");
		System.out.println("(): 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨, 파라미터가 두 개 이상일 때는 ,를 구분자로 해서 구분을 해줌");
		System.out.println("{}: 메서드의 본문.. 메서듣 호출 때 실행하고 싶은 코드를 작성해줌");
		System.out.println("메서드 호출 : 메서드를 사용하는 것을 의미, 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 그 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
		
	}
	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음");
	}
	public void callName(String name) {
		System.out.println("안녕하세요, "+name);
	}
	public void printDan(int dan) {
		System.out.println(dan *1);
		System.out.println(dan *2);
		System.out.println(dan *3);
		System.out.println(dan *4);
		System.out.println(dan * 5);
		System.out.println(dan  *6);
		System.out.println(dan *7);
		System.out.println(dan *8);
		System.out.println(dan *9);
		
	}
    public void printScore(String name,int score) {
    	System.out.println(name+" " +score+" "+"점");}
    
    
    public void yous(String name2,String project,int zumsu ){
    	System.out.println(name2+ " "+ project +" " +zumsu + " " +"점");
    
    }
    public void printJava(String greet1, String ment1, String name3) {
    	System.out.println(greet1+ " "+ ment1 + " " + name3 );
    }
    
    public void printJava2(String greet2, String ment2, String name4) {
    	System.out.println(greet2 + " " + ment2 + " " + name4);
    }
    
    	
    
    	
    	
    }
