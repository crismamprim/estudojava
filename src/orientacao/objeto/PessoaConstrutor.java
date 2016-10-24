package orientacao.objeto;

public class PessoaConstrutor {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Cristiano");
		System.out.println(pessoa1.nome + " " + pessoa1.idade);
		
		Pessoa pessoa2 = new Pessoa("Talita", 26);
		System.out.println("\"" + pessoa2.nome + "\" idade " + pessoa2.idade);
		
		
	

	}

}
