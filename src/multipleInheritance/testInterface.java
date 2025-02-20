package multipleInheritance;

public interface testInterface {
	//public, statci and final
	
	final int a=10;
	
	//public and abstract
	public void display();

}

//class implementing interface

class TestClass implements testInterface
{

	@Override
	public void display() {
		System.out.println("Sr QA");
		
	}
	
}


