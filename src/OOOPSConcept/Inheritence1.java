package OOOPSConcept;

public class Inheritence1 extends Inheritence{
	
	float bonus =2000;
	
	public static void main(String[] args) {
		
		Inheritence1 obj = new Inheritence1();
		System.out.println("The salary is: "+ obj.salary);
		System.out.println("The bonus is: "+ obj.bonus);
		obj.bonus();
	}

}
