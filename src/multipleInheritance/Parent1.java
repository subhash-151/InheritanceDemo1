package multipleInheritance;

public class Parent1 
{
	
	public void fun() {
		
		System.out.println("parent 1");
	}

}

class Parent2 
{
	
	public void fun() {
		
		System.out.println("parent2");
	}
}
class Test extends Parent1, parent2 {
	
	Test t= new Test();
	t.fun();
}
