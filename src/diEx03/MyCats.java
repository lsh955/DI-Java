package diEx03;

import java.util.ArrayList;

public class MyCats {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double weight;
	private String color;

	
	// 생성자를 통해 name, age, hobbys를 받아와 각각의 필드의 값들을 초기화 시켜줌
	public MyCats(String name, int age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<String> getHobbys() {
		return hobbys;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
}
