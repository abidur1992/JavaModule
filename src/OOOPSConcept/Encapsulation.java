package OOOPSConcept;

public class Encapsulation {
	
	private String name;
	private String address;
	private int age;
	private String race;
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public String getRace(){
		return race;
	}
	
	public void setRace (String race){
		this.race=race;
	}
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setName("Abid");
		obj.setAddress("1634 Glover street");
		obj.setAge(23);
		obj.setRace("Asian");
		
		System.out.println("The name is: "+ obj.getName());
		System.out.println("The address is: "+ obj.getAddress());
		System.out.println("The age is: "+ obj.getAge());
		System.out.println("The race is: "+ obj.getRace());
		}

}
