package model;

public class Cliente {
	
	private String nome;
	private String cidade;
	
	Pedido pedidos;
	
	
	public Cliente(String nome, String cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cidade=" + cidade + ", pedidos=" + pedidos + "]";
	}


	public Pedido getPedidos() {
		return pedidos;
	}


	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
