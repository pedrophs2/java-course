package exercicios;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedro";
		String sobrenome = "Henrique";
		int idade = 22;
		double salario = 2_489.168;
		
		System.out.printf("O desenvolvedor %s %s tem %d anos e recebe R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println();
		
		String mensagem = String.format("O desenvolvedor %s %s tem %d anos e recebe R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(mensagem.hashCode());
		
		System.err.print("Teste");
	}

}
