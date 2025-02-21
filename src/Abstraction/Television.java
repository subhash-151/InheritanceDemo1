package Abstraction;

public abstract class Television {
	
	abstract void turn_On();
	abstract void turn_Off();
	
	}

class Tv_remote extends Television{

	@Override
	void turn_On() {
		System.out.println("Tv is on mode");
		
	}

	@Override
	void turn_Off() {
		System.out.println("TV is off mode");
		
	}
	
	
	
}
