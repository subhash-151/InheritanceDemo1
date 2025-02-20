package spack;

public class Mobile //parent class
{
	
	
	String brand;
	String color;
	int cost;
	
	
	public void name() {
		
		System.out.println("name is:"+brand);
	}

}

 class Apple extends Mobile//child class inherits parent class
 {
	 
	 
	 String camera;
	 
	 public void camplexel() {
		 
		 
		 System.out.println("camplexl is:"+camera);
	 }
	
	
	
	
	
}
