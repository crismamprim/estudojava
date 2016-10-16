package programacao;

import java.util.Scanner;

public class Eleicao2016 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int cristiano=0,
			zeDoCarmo=0,
			nulos=0,
			totalEleitores;
			   
		int votacao=0;
		
		do {
			System.out.println("VOTAÇÃO 2016");
			System.out.println("Cristiano [12] Zé do Carmo [22]" );
			votacao = dados.nextInt();
			
			if (votacao == 12) {
				cristiano++;
			}else if (votacao == 22) {
				zeDoCarmo++;
			}else if (votacao !=12 && votacao != 22 && votacao !=0) {
				nulos++;
			}
					
		} while (votacao != 0);
		
		
		totalEleitores = cristiano + zeDoCarmo + nulos;
		
		System.out.println("Resultado final da votação");
		System.out.println("Total de eleitores " + totalEleitores);
		System.out.println("Cristiano teve " + "["+ cristiano +"] " + " votos");
		System.out.println("Zé do Carmo teve " + "[" + zeDoCarmo + "]" + " votos");
		System.out.println("Votos nulos " + "["+ nulos + "]");
		

	}

}
