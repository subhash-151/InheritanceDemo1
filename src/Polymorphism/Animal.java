package Polymorphism;

import java.lang.classfile.Superclass;

public class Animal {
	
	public void displayInfo() {
		
		
		System.out.println("i am in animal");
	}
	
}
	class Dog extends Animal{
		
		
		
		public void displayInfo() {
			
			super.displayInfo();
			
			System.out.println("i am in dog");
			
		}
	}