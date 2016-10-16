package orientacao.objeto;

public class CarroPrincipal {

	public static void main(String[] args) {
		
		Carro[] carro = new Carro[4]; // instanciar classe
		
		carro[0] = new Carro();
		
		carro[0].fabricante = "FORD";
		carro[0].modelo = "MUSTANG";
		carro[0].anoFabricacao = 2016;
		carro[0].numeroChassi = 01132005;
		
		
		System.out.println("Ano de fabricação " + carro[0].anoFabricacao);

	}

}
