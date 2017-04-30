package Loops;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		int marks =92;
		
		if (marks <=50){
			
			System.out.println("The grade will be F");
	
		}
		
		 else if (marks >=60 && marks <=69){
			 
			 System.out.println("The grade is D");
			
			}
		
		 else if (marks>=70 && marks <=79){
			 
			 System.out.println("The grade is C");
		 }
			 
		 else if (marks>=80 && marks <=89) {
			 
			 System.out.println("The grade is B");
		 }
		
		 else if (marks >=90){
			 
			 System.out.println("The grade is A");
		 }
		
		 else {
			 
			 System.out.println("Thje grade is unmentionable");
		 }
	}

}
