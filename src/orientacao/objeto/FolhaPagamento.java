package orientacao.objeto;

public class FolhaPagamento {
		
	double salarioLiquido;
	
	double CalculaSalario(int horaNormal, int horaExtra, double valorHoraNormal, double valorHoraExtra){
		
		double valorHorasNormais = horaNormal * valorHoraNormal;
		double valorHorasExtras  = horaExtra * valorHoraExtra;
		
		return valorHorasNormais + valorHorasExtras;
	}
	
	
	double CalculaInss(double salarioBruto){
		if (salarioBruto <= 1556.94) {
				salarioLiquido = (salarioBruto * 8) / 100;
		
		}else if (salarioBruto >= 1556.95 && salarioBruto <= 2594.92){
					salarioLiquido = (salarioBruto * 9) / 100;
		}
		
		return salarioLiquido;
	}

}
