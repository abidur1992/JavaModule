package OOOPSConcept;

public class StaticAndNonStatic {
	
	static int i=10;
	
	int z=4;
	
	public static void eat(){
		System.out.println("We need to eat healthy food");
	}
	
	public void gym(){
		System.out.println("We need to go gym to keep ourself fit");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(StaticAndNonStatic.i);
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.gym();
		System.out.println(obj.z);
		StaticAndNonStatic.eat();
		
		
		
		
	}

}
