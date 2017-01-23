package model;

public class Pedido {
	
	private String nome;
	private int quantidade;
	private double valorUnitario;
	private double valorTotal;
	
	
	public Pedido(String nome, int quantidade, double valorUnitario, double valorTotal) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}


	@Override
	public String toString() {
		return "Pedido [nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario
				+ ", valorTotal=" + valorTotal + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}
