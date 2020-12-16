package interfaces;

public class Dime implements Bank{
	
	

	@Override
	public void transfar() {
 		System.out.println("this is overriden method from Interface");
	}

	@Override
	public void deposit() {
 		System.out.println("this is overriden method from Interface");
	
	}

	public static void main(String[] args) {
 
		Dime dime = new Dime();
		
		dime.transfar();
		dime.deposit();
		
		
		
	}

	 

}
