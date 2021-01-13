package com.naver;

import java.io.Serializable;

public class Dog implements Serializable, Comparable<Dog> {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private String id;
	private String master;
	private int age;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String id, String master, int age) {
		super();
		this.name = name;
		this.id = id;
		this.master = master;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getMaster() {
		return master;
	}

	
	public void setMaster(String master) {
		this.master = master;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog [id=" + id + ", name=" + name + "]";
	}

}
