package programacao;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int idade,
			meses,
			dias,
			idadeDias,
			mesesDias,
			resultado;
		
		System.out.println("Digite sua idade");
		idade = dados.nextInt();
		
		System.out.println("Digite os meses");
		meses = dados.nextInt();
		
		System.out.println("Digite os dias");
		dias = dados.nextInt();
		
		idadeDias = idade * 365;
		mesesDias = meses * 30;
		
		resultado = idadeDias + mesesDias + dias;
		
		System.out.println("Voce tem " + resultado + " dias de vida");

	}

}
