package spack;

public class Shape 
{
	
	public void display() {
		
		System.out.println("inside display");
	}

}
class Rectangle extends Shape
{
    public void area() {
    	
    	System.out.println("inside area");
    }	
	
	
}
class Cuble extends Rectangle
{
	public void volume() {
		
		System.out.println("inside volume");
		
	}

}
