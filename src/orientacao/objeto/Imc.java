package orientacao.objeto;

public class Imc {
	
	double imc;
	double altura;
	double pesso;
	
	
	public double calculaiImc(){
		
		imc = pesso * altura;
		
		return imc;
	}

}
