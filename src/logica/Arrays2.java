package logica;
public class Arrays2 {
	
	public static void main(String[] args){
		String[] paises = {"Brasil", "Russia", "China"};
		for(int i = 0; i < paises.length; i++){
			for(int j = 1; j < paises.length; j++){
				System.out.println(paises[j] + " J");	
			}
			System.out.println(paises[i] + " I");
			
		}
	}
} 
