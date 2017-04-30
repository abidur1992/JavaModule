package Accessible;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		//String str [] [] = new String [2] [2];
		
		/*str [0][0]= "Abidur";
		str [1][0]= "Rahman";
		str [0][1]= "Adidur";
		str [1][1]= "Rahman";*/
		
		String str [][] = { {"Abidur", "Rahman"}, {"Adilur","Rahman"}};
		for (int i=0; i<str.length; i++){
		
		for (int j=0; j<str[i].length; j++){
			
			System.out.println(str[i][j]);
		}
		}
				
	
	}

}
