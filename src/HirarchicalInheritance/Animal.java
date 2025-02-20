package HirarchicalInheritance;

public class Animal //Parent class
{
	
	public void eat() {
		
		System.out.println("This animal eats food");
	}
	

}

class Dog extends Animal//child class

{
	public void bark() {
		
		System.out.println("The dog barks");
	}
	
}
class cat extends Animal//child class
{
	
	public void meow() {
		
		System.out.println("The cat meow");
	}
}
