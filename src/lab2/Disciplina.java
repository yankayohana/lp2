package lab2;

import java.util.Arrays;

/**
 * Essa Classe representa a conta do aluno na cantina.
 * 
 * @author yanka yohana
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
	
	/** Construtor adicional que recebe o número de notas, nome da disciplina e 
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

	private int[] setPesos() {
		int[] pesos = new int[notas.length];
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = 1;
		}
		return pesos;
	}

	public void cadastraHoras(int horas) {
		this.horasEstudo = horas;

	}

	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;

	}

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

	public boolean aprovado() {
		boolean aprovado = false;
		double media = calculaMedia();
		if (media >= 7) {
			aprovado = true;
		}
		return aprovado;

	}

	public String toString() {
		return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
	}

}
