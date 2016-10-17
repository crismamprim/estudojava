package orientacao.objeto;

public class CarroPrincipal {

	public static void main(String[] args) {
		
		CarroProprietario dono1 = new CarroProprietario();
		CarroProprietario dono2 = new CarroProprietario();
		
		dono1.nome = "Cristiano";
		dono2.nome = "Talita";
		
		Carro meuCarro = new Carro();
		Carro seuCarro = new Carro();
		
		meuCarro.fabricante = "FORD";
		meuCarro.anoFabricao = 2016;
		meuCarro.dono = dono1;
		
		seuCarro.fabricante = "FORD";
		seuCarro.anoFabricao = 2016;
		seuCarro.dono = dono2;
		
		System.out.println("Nome " + meuCarro.dono.nome);
		System.out.println("Nome " + seuCarro.dono.nome);
		System.out.println();
		
		meuCarro.dono.nome = "Enrico";
		
		
		System.out.println("Nome " + meuCarro.dono.nome);
		System.out.println("Nome " + seuCarro.dono.nome);

	}

}
