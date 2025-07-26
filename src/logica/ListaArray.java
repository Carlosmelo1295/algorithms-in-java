package logica;
import java.util.ArrayList;

//adicionando equipes por meio do arraylist
public class ListaArray{
	public static void main(String[] args){
	    ArrayList<String> cores = new ArrayList<>();
		cores.add("Elemento");
		cores.add("Elemento2");
		
		
		System.out.println(cores.toString());
		System.out.println(cores.get(1));
		System.out.println(cores.indexOf("Elemento2"));
		
		cores.remove("Elemento");
		

		System.out.println(cores.contains("Elemento"));
		System.out.println(cores.toString());



	    
	}
}