package OOOPSConcept;

public class Abstraction1 extends Abstraction {
	
	
	public void engine(){
		
		System.out.println("This will have 6 cylender engine");
		
	}
	public void door(){
		
		System.out.println("This is 4 door car");
		
	}
	
	public static void main(String[] args) {
		
		Abstraction obj = new Abstraction1();
		obj.door();
		obj.engine();
		obj.model();
	}
	
	

}
