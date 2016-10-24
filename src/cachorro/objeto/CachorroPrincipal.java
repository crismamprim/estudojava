package cachorro.objeto;

public class CachorroPrincipal {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Valeria");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinaSentar(cachorro);

	}

}
