package orientacao.objeto;

import java.text.DecimalFormat;

public class FolhaPagamentoPrincipal {

	public static void main(String[] args) {
		
		double salarioLiquido;
		double valeAlimentacao = 45.00;
		double totalDescontos;
	
		FolhaPagamento folha = new FolhaPagamento();
		DecimalFormat reais = new DecimalFormat(",##0.00");
		
	    double salarioBruto = folha.CalculaSalario(40, 0, 34.00, 0.0);
	    
	    System.out.println("Salario Bruto ----------------------- " + reais.format(salarioBruto));
		
		double inss = folha.CalculaInss(salarioBruto);
		
		System.out.println("INSS --------------------------------   " + reais.format(inss));
		
		salarioLiquido = salarioBruto - inss - valeAlimentacao;
		totalDescontos = inss + valeAlimentacao;
		
		System.out.println("Vale alimentação 20% CONF. PAT ------    " + reais.format(valeAlimentacao));
		System.out.println("");
		System.out.println("TOAL DE DESCONTOS -------------------   " + reais.format(totalDescontos));
		System.out.println("SALARIO LIQUIDO --------------------- " + reais.format(salarioLiquido));

	}

}
