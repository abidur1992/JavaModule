package OOOPSConcept;

public class RuntimePolymorphism3 extends RuntimePolymorphism2 {
	
	
	public void carParts(){
		
		System.out.println("This is main window");
	}
	
	public static void main(String[] args) {
		
		RuntimePolymorphism2 obj = new RuntimePolymorphism3();
		obj.carParts();
		
	 
	}
 
 
}
