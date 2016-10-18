package programacao;

public class Wrappers {

	public static void main(String[] args) {
		
		int x = 5;
		Integer i = new Integer(5);
		
		Byte bit = i.byteValue();
		
		System.out.println(bit);
		
		
		String valor = "15.5";
		Float v = new Float(valor);
		System.out.println(v);
		
		int idade = Integer.parseInt("10"); //passa string para inteiro
		
		
		int d = 36;
		StringBuffer binario = new StringBuffer(); // guarda os dados
		while (d > 0) {
			int b = d % 2;
			binario.append(b);
			d = d >> 1; // é a divisão que você deseja
		}
		System.out.println(binario.reverse().toString());

	}

}
