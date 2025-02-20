package Polymorphism;

  //compile-time (static) polymorphism

public class MathsOperations {
	/*Java determines which method to call based on the 
	method signature (number and type of arguments)*/
	
	/*The add method is overloaded three times with 
	different parameter types and numbers.*/
	
	int add(int a,int b) {
		
		return a+b;
		
	}
	
	int add(int a,int b,int c) {
		
		return a+b+c;
		}
	
	double add(double a,double b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		MathsOperations math= new MathsOperations();
		 System.out.println("Add of two integer:"+math.add(10, 20));
		 System.out.println("add of three integer:"+math.add(12, 20, 30));
		 System.out.println("Add of the two double"+math.add(1.2, 2.7));
		

	}

}
