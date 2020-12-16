package Abstraction;

public class Prime  extends Car {
	
	
	@Override
	public void engine() {
		System.out.println("this is overriden abstract engine method");
		
	}

	public static void main(String[] args) {

       	Prime  pm = new Prime();
       	
       	pm.engine();
       	
       	pm.start();

	}

	 

}
