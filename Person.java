package Exercise_3;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public Person () {
		this.name = "";
		this.age = 0;
		this.address = "";
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
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
	
	public void input () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		System.out.println("Nhap dia chi: ");
		address = sc.nextLine();
		address = sc.nextLine();
	}
	
	public int getYearOfBirth() {
		return 2023 - this.age;
	}
	
	public String getUpperName() {
		return this.name.toUpperCase();
	}
	
	public boolean checkAge(int n) {
		return (this.age > n);
	}
}