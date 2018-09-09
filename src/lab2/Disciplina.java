package lab2;

import java.util.Arrays;

public class Disciplina {
	private double[] notas;
	private String nomeDisciplina;
	private int horasEstudo;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];

	}

	public void cadastraHoras(int horas) {
		this.horasEstudo = horas;

	}

	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;

	}

	private double calculaMedia() {
		double somaNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}
		return somaNotas / 4;

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