package model;

public class ClientePrincipal {

	public static void main(String[] args) {
		
		
		Pedido p1 = new Pedido("tv led", 1, 13.3, 13.3);
		Cliente c1 = new Cliente("cristiano", "londrina");
		c1.setPedidos(p1);
		
		
		Cliente c2 = new Cliente("talita", "londrina");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
