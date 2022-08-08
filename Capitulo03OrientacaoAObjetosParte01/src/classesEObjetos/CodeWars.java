package classesEObjetos;

public class CodeWars {
	
	public static void main(String[] args) {
		
		System.out.println(rentalCarCost(7));
		
	}
	
	public static int rentalCarCost(int d) {
	    int desconto50 = 50;
	    int desconto20 = 20;
	    int totalComDesconto;

	    
	    if(d >= 7) {
	      totalComDesconto = (d * 40) - desconto50;   
	    }else if(d >= 3){
	    	totalComDesconto = (d * 40) - desconto20; 
	    	
	    }else {
	    	totalComDesconto = d * 40;	
	    }
	    	
	    return totalComDesconto;
	  }
		
}
