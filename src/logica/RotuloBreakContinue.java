package logica;
public class RotuloBreakContinue {
	public static void main(String[] args){
	    Boolean [][] matrix = { 
			{false, true, false, false,false},
			{false, false, false, false,false}
		};

		busca:
		for(int a = 0; a < matrix.length; a++ ){
			System.out.print("A ");
			for(int b = 0; b < matrix[a].length; b++){
				if(matrix[a][b]){
					System.out.print("TRUE ");
					break busca;
				}
				System.out.print("B ");
			}
		}
	}
}
// break; para o fluxp inteiro.
// continue; quebra o fluxo em uma determinada condição.
// rótulo: apelido para um loop.