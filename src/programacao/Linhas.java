package programacao;

public class Linhas {

	public static void main(String[] args) {
		
		int x = 0;
		int numeroLinhas = 7;
		int linhas = 0;
		
		while (numeroLinhas != linhas) {
			
			x = 1 - x;
			
			if (x == 1) {
				System.out.println("Azul");
			}
			else if (x == 0) {
				System.out.println("Verde");
			}
			linhas ++;
		}
	}

}
