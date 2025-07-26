package logica;
import java.util.Scanner;
import java.util.Random;


public class JogoDados{
	public static void main(String[] args){
		int[] valoresDoDado = {1, 2, 3, 4, 5, 6};
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Escolha um palpite.");
		int palpite = scanner.nextInt();
		
		System.out.println("Seu palpite foi: " + palpite);
		
		System.out.println("Dados jogados...");
		
		int jogarDados = random.nextInt(6) + 1;
		
		System.out.println("O valor do dado é: " + jogarDados);
		
		if(palpite == jogarDados){
			System.out.println("Você acertou!!!");
			
			}else{
			System.out.println("Não foi dessa vez :/");
			
		}
	}
	
}