/*
 * File : TestAnimals 
 * Description : Java program to understand and implement Interfaces 
 * Author : Stephin Mathew 
 * Version : 1.0
 * Date :4/11/2023
 */


package test;
//Class Animal
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This Animal walks on "+legs+" legs ");
	}
}

// Class Spider
class Spider extends Animal{
	public Spider(){
	  super(8);	
	}
	@Override
	public void eat() {
		System.out.println("Spider eats Insects ");
	}
}

//InterFace Pet
interface Pet{
	String getName() ;
	void setName(String name);
	void play();
}

//Class Cat
class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat() {
		this("");
	}
	
	public void eat() {
		System.out.println("Cat eat Fishes");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void play() {
		System.out.println("The Cat is playing ");
	}
}
//Class Fish
class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
		}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void play() {
		System.out.println("The Fish is playing ");
	}
	public void eat() {
		System.out.println("The Fish eats plants ");
	}
	public void walk() {
		System.out.println("The Fish has no legs");
	}
}

public class TestAnimals {
  public static void main(String[] args) {
	  System.out.println("FISH");
	  Fish fish=new Fish();
	  fish.setName("Mimi");
	  System.out.println("This Fish's name is "+fish.getName());
	  fish.eat();
	  fish.walk();
	  fish.setName("Momo");
	  System.out.println("This Fish's name is "+fish.getName());
	  
	  System.out.println("CAT");
	  Cat cat = new Cat("Fluffy");
	  System.out.println("This Cat's name is "+cat.getName());
	  cat.walk();
	  cat.eat();
	  cat.setName("Moose");
	  System.out.println("This Cat's name is "+cat.getName());
	  
	  System.out.println("SPIDER");
	  Spider spider=new Spider();
	  spider.eat();
	  spider.walk();
  }
}
