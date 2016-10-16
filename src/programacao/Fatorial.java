package programacao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int tamaho = 20;
		int [] fat = new int[tamaho];
		int soma = 1;
		
		System.out.println("Fatorial do numero " + "["+ tamaho + "]");
		System.out.println();
		
		for (int i = 0; i < fat.length; i++) {
			
			fat[i] = i + 1;
			soma = (soma * fat[i]);
			System.out.print(fat[i]);
		}
		
		System.out.println("= " + soma);
		System.out.println("fim");
	}

}
