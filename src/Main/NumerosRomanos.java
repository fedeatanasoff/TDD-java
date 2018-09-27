package Main;

public class NumerosRomanos {

	public String convertirARomanos(int num) {
		
		
		
		switch(num) {
		case 4:
			return "IV";
		case 9:
			return "IX";
		}
		
		if(num < 4) {
			return sumarI(1, num, "");
		}
		
		if(num < 9) {
			return sumarI(6, num, "V");
		}
		
		return null;
	}
	
	
	private String sumarI(int desde, int numero,String romano) {
		
		for(int i=desde; i <= numero; i++) {
			romano += "I";
		}
		//System.out.println(res);
		return romano;
	}
}
