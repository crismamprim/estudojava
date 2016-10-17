package orientacao.objeto;

import java.text.DecimalFormat;

public class FolhaPagamentoPrincipal {

	public static void main(String[] args) {
		
		double salarioLiquido;
	
		FolhaPagamento folha = new FolhaPagamento();
		DecimalFormat reais = new DecimalFormat("R$ ,##0.00");
		
	    double salarioBruto = folha.CalculaSalario(40, 10, 25, 0);
	    
	    System.out.println("Salario Bruto " + reais.format(salarioBruto));
		
		double inss = folha.CalculaInss(salarioBruto);
		
		System.out.println("INSS " + reais.format(inss));
		
		salarioLiquido = salarioBruto - inss;
		
		System.out.println("Salario Liquido " + reais.format(salarioLiquido));

	}

}
