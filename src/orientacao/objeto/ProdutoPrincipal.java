package orientacao.objeto;

import java.text.DecimalFormat;

public class ProdutoPrincipal {

	public static void main(String[] args) {
		
		ProdutoImpostos imposto = new ProdutoImpostos();
		imposto.ValorCusto = 259;
		
		ProdutoVenda produto = new ProdutoVenda();
		produto.calculaPrecoVenda(imposto, 20, 15);
		
		DecimalFormat reais = new DecimalFormat(",##0.00");
		
		System.out.println("Valor de custo " + reais.format(imposto.ValorCusto));
		System.out.println("Valor impostos " + reais.format(imposto.valorImposto));
		System.out.println("Valor de lucro " + reais.format(imposto.valorLucro));
		System.out.println("Preço de venda " + reais.format(imposto.precoVenda));
	}

}
