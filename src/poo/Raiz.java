package poo;

import java.util.ArrayList;

public class Raiz {
	//ArrayList<Integer> arrayDesc = new ArrayList<>();
	ArrayList<Integer> arrayAsc = new ArrayList<>();
	ArrayList<Integer> resultado = new ArrayList<>();

	ArrayList<Integer> calcular(int valor, int parimpa) {

//		for (int i = valor; i >= 0; i--) {
//
//			if (i % 2 != parimpa) {
//				arrayDesc.add(i);
//			}
//
//		}

		for (int j = 0; j <= valor; j++) {

			if (j % 2 != parimpa) {
				arrayAsc.add(j);

			}

		}

		int fistRes = valor - arrayAsc.getFirst();
		resultado.add(fistRes);
		System.out.println(valor + " - " + arrayAsc.getFirst() + " = " + fistRes);

		for (int k = 1; k < valor; k++) {

			//arrayDesc.removeFirst();
			arrayAsc.removeFirst();
			if (resultado.size() >= 1) {
				int somaArr = resultado.getFirst() - arrayAsc.getFirst();
				System.out.println(resultado.getFirst() + " - " + arrayAsc.getFirst() + " = " + somaArr);
				resultado.remove(resultado.getFirst());
				resultado.add(somaArr);

				if (somaArr < arrayAsc.getFirst()) {
					System.out.println("A raiz quadrada de " + valor + " é " + (k+1));

					break;
				}
			}

		}

		return resultado;
	}

}
