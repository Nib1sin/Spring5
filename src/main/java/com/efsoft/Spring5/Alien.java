package com.efsoft.Spring5;

public class Alien {
	
	private int age;
	private Laptop laptop;
	private Computer computer;
	
	
	public Alien(int age) {
		super();
		this.age = age;
	}

	public void code (){
		System.out.println("Im Coding...");
		computer.compile();
	}
	


	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Alien() {
		System.out.println("Alien Object Created..");
	}	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age assigned...");
		this.age = age;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
