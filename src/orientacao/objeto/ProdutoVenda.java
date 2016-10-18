package orientacao.objeto;

public class ProdutoVenda {
	
	void calculaPrecoVenda(ProdutoImpostos imposto, double percentualImpostos, double margemLucro){
		
		imposto.valorImposto = imposto.ValorCusto * (percentualImpostos / 100);
		imposto.valorLucro   = imposto.ValorCusto * (margemLucro / 100);
		imposto.precoVenda   = imposto.ValorCusto + imposto.valorImposto + imposto.valorLucro;
		
	}

}
