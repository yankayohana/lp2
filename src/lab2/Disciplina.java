package lab2;

import java.util.Arrays;

/**
 * Essa Classe representa a conta do aluno na cantina.
 * 
 * @author Yanka Yohana - Laboratório de Programaçao 2
 */

public class Disciplina {

	/**
	 * Double que representa um Array de notas do aluno.
	 */
	private double[] notas;

	/**
	 * String que representa o nome da disciplina.
	 */
	private String nomeDisciplina;

	/**
	 * Inteiro que representa a quantidade de horas de estudo.
	 */
	private int horasEstudo;

	/**
	 * Inteiro que representa um Array com o pesos das notas.
	 */
	private int[] pesos;

	/**
	 * Constrói as informações na disciplina a partir do nome da disciplina.
	 * 
	 * @param nomeDisciplina
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
		this.pesos = setPesos();

	}

	/**
	 * Construtor adicional que recebe o numero de notas de uma disciplina.
	 * 
	 * @param quantidadeNotas
	 * @param nomeDisciplina
	 */
	public Disciplina(int quantidadeNotas, String nomeDisciplina) {
		this.notas = new double[quantidadeNotas];
		this.nomeDisciplina = nomeDisciplina;
		this.pesos = setPesos();

	}
	
	/** 
	 * Construtor adicional que recebe o número de notas, nome da disciplina e 
	 * um Array de inteiros que representa o peso 
	 * @param quantidadeNotas
	 * @param nomeDisciplina
	 * @param pesos
	 */
	public Disciplina(int quantidadeNotas, String nomeDisciplina, int[] pesos) {
		this.notas = new double[quantidadeNotas];
		this.nomeDisciplina = nomeDisciplina;
		this.pesos = pesos;
	}
	
	/** 
	 * Retorna um Array de inteiros com os pesos iguais a 1.
	 * @return um Array de inteiros.
	 */
	private int[] setPesos() {
		int[] pesos = new int[notas.length];
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = 1;
		}
		return pesos;
	}
	
	/**
	 * Cadastra a quantidade de horas de estudo.
	 * @param horas um inteiro que representa as horas de estudo.
	 */
	public void cadastraHoras(int horas) {
		this.horasEstudo = horas;
		
	}
	
	/**
	 * Cadastra qual a nota e seu valor. Exemplo: nota: 1, valorNota: 7,0.
	 * @param nota um inteiro que representa qual nota.
	 * @param valorNota um double que representa a nota.
	 */
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
		
	}
	
	/**
	 * Calcula a media do aluno na disciplina.
	 * @return um double referente a media do aluno.
	 */
	private double calculaMedia() {
		double somaNotas = 0;
		double somaPesos = 0;
		for (int i = 0; i < pesos.length; i++) {
			somaPesos += pesos[i];
		}
		
		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i] * pesos[i];
		}
		return somaNotas / somaPesos;
		
	}
	
	/**
	 * Verifica se o aluno foi aprovado na disciplina ou não.
	 * @return um boolean que indica se o aluno foi aprovado ou não, true = aprovado e false = nao aprovado.
	 */
	public boolean aprovado() {
		boolean aprovado = false;
		double media = calculaMedia();
		if (media >= 7) {
			aprovado = true;
		}
		return aprovado;
		
	}
	
	/**
	 * Retorna a string que representa a disciplina.
	 */
	public String toString() {
		return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
	}
	
}

	
