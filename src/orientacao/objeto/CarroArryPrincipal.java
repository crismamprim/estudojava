package orientacao.objeto;

public class CarroArryPrincipal {

	public static void main(String[] args) {
		
		CarroArray[] carro = new CarroArray[4]; // instanciar classe
		
		carro[0] = new CarroArray();
		
		carro[0].fabricante = "FORD";
		carro[0].modelo = "MUSTANG";
		carro[0].anoFabricacao = 2016;
		carro[0].setAnoFabricacao(2016);
		
		
		System.out.println("Ano de fabricação " + carro[0].getAnoFabricacao());

	}

}
