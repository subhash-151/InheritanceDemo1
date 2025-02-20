package spack;

public class Demo {

	public static void main(String[] args) {
		
		Mobile m=new Mobile();//create object of parent class
		m.brand="Samsung";
		m.color="white";
		m.cost=20000;
		
		
		//m.name();
		
		
		Apple a= new Apple();
		a.brand="apple";
		a.color="black";
		a.cost=40000;
		a.name();
		a.camera="5MP";
		a.camplexel();

	}

}
