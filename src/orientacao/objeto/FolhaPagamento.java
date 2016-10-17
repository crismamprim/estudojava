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
		}
		
		return salarioLiquido;
	}

}
