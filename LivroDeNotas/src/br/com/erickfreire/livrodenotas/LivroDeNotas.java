package br.com.erickfreire.livrodenotas;


/**
 * Programa em Java que simula um livro de notas de alunos com vetores
 * @author Erick Freire
 * @version 1 - Criado em 29-05-2021 as 14:56
 */

public class LivroDeNotas {
	private String nomeDoCurso;
	private int[] notas;
	
	public LivroDeNotas(String ndCurso, int[] n) {
		
		this.nomeDoCurso = ndCurso;
		this.notas = n;
		
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public void processamentoDeNotas() {
		saideDeNotas();
		
		System.out.printf("%nMédia das Notas: %.2f%n", getMedia());
		
		System.out.printf("%nMenor Nota: %d%nMaior Nota: %d%n%n", getMenor(), getMaior());
		
		imprimeGraficoDeBarras();
	}
	
	public int getMenor() {
		int menorNota = notas[0];
		
		for(int nota : notas) {
			if(nota < menorNota)
				menorNota = nota;
		}
		
		return menorNota;
	}
	
	public int getMaior() {
		int maiorNota = notas[0];
		
		for(int nota : notas) {
			if(nota > maiorNota)
				maiorNota = nota;
		}
		
		return maiorNota;
	}
	
	public double getMedia() {
		int total = 0;
		
		for(int nota : notas)
			total += nota;
		
		return (double) total / notas.length;
	}
	
	public void imprimeGraficoDeBarras() {
		System.out.println("Distribuição de Notas:");
		
		int[] frequencia = new int[11];
		
		for (int nota : notas) 
		  ++frequencia[nota / 10];
		
		for (int contador = 0; contador < frequencia.length; contador++) {
			if (contador == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ",contador * 10, contador * 10 + 9);
		
			for (int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++)
				System.out.print("*");
			
			System.out.println();
			
		}
	}
	
	public void saideDeNotas() {
		System.out.printf("As Notas São:%n%n");
		
		for (int estudante = 0; estudante < notas.length; estudante++)
			System.out.printf("Estudante %2d: %3d%n",estudante + 1, notas[estudante]);
	}
	

}
