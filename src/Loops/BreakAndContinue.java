package Loops;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			if(i>=7 && i<=9)
				continue;
			
			//if(i==7)
				//break;
			
			System.out.println(i);
		}
		
	}

}
