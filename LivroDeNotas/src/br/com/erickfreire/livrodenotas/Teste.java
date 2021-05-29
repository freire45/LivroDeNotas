package br.com.erickfreire.livrodenotas;

public class Teste {

	public static void main(String[] args) {
		
		int[] vetorDeNotas = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		LivroDeNotas meulivro = new LivroDeNotas("T1-P1 - Introdução ao Java", vetorDeNotas);
		
		System.out.printf("Bem vindo ao livro de notas para: %n%s%n%n", meulivro.getNomeDoCurso());
		
		meulivro.processamentoDeNotas();
		
	}

}
