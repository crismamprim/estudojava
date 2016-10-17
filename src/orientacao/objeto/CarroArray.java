package orientacao.objeto;

public class Carro {
	
	String modelo;
	String fabricante;
	int anoFabricacao;
	private int numeroChassi;
	
	
	
	
	
	public int getAnoFabricacao() {
		
		if (anoFabricacao >= 2016) {
			System.out.println("Prabens, seu carro esta em dia");
		}
				
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
	

}
