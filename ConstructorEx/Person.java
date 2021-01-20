package kr.co.ezen;


public class person {
	private String ssn; // 지역변수 선언문
	private String name;
	private int age;
	private String address;
	private String job;
	private Dog dog;
	private Car car;
	public person() {
		// TODO Auto-generated constructor stub
	}

	public person(String ssn, String name, int age, String address, String job, Dog dog, Car car) {
	 // 필드에 사용자 
생성자를 사용함 단축키는 [Alt]+[Shift]+[s]키 사용 //
	
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
		this.job = job;
		this.dog = dog;
		this.car = car;
	}
	// get,set 변수명 사용
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}