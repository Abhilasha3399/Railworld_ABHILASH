package p1;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String Name;
	private String Gender;
	private int Age;
	public Person(String name, String gender, int age) {
		super();
		Name = name;
		Gender = gender;
		Age = age;
	}
	
	 public Person() {
		 
		 
	 }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + "]";
	}
	
	
	
	
	}


