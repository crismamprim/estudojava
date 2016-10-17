package orientacao.objeto;

public class FolhaPagamento {
		
	double salarioLiquido;
	double teto = 570.88;
	
	double CalculaSalario(int horaNormal, int horaExtra, double valorHoraNormal, double valorHoraExtra){
		
		double valorHorasNormais = horaNormal * valorHoraNormal;
		double valorHorasExtras  = horaExtra * valorHoraExtra;
		
		return valorHorasNormais + valorHorasExtras;
	}
	
	
	double CalculaInss(double salarioBruto){
		if (salarioBruto <= 1556.94) {
			salarioLiquido = (salarioBruto * 2) / 100;
		
		}else if (salarioBruto >= 1556.95 && salarioBruto <= 2594.92){
			salarioLiquido = (salarioBruto * 3) / 100;
		
		}else if (salarioBruto >= 2594.92 && salarioBruto <= 5189.82){
			salarioLiquido = (salarioBruto * 5) / 100;
		
		}else
			salarioLiquido = teto;
				
		return salarioLiquido;
	}

}
