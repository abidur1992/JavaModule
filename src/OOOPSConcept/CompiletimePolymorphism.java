package OOOPSConcept;

public class CompiletimePolymorphism {
	
		
	
	
		public void run(int x, int y){
			
			System.out.println(x+y);
			
		}
		
		public void run(int y, int z, int x){
			
		    System.out.println(x+y+z);
			
		}
		
		
		
	   public static void main(String[] args) {
	 
	   CompiletimePolymorphism obj = new CompiletimePolymorphism();
	   obj.run(10, 20);
	   obj.run(2, 5, 7);
	 
	 
}


}
