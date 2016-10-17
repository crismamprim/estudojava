package orientacao.objeto;

public class ImcPrincipal {

	public static void main(String[] args) {

		Imc imc = new Imc();
		
		imc.altura = 10;
		imc.pesso = 40;
		
		
		double resultadoImc = imc.calculaiImc();
		
		System.out.println(resultadoImc);
		

	}

}
