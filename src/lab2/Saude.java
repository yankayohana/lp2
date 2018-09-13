package lab2;

/**
 * Essa classe representa o estado de saúde de cada aluno.
 * 
 * @author Yanka Yohana - Laboratório de Programaçao 2
 */
public class Saude {
	
	/**
	 * String que representa o estado de saude fisica do aluno.
	 */
	private String saudeFisica;
	
	/**
	 * String que representa o estado de saude mental do aluno.
	 */
	private String saudeMental;

	/**
	 * Constrói um objeto Saúde com os atributos saudeFisica e saudeMental como "boa".
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}

	/**
	 * Atribue um valor a saúde mental do aluno.
	 * @param valor uma string que representa o estado de saúde mental.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}

	/**
	 * Atribue um valor a saúde física do aluno.
	 * @param valor uma string que representa o estado de saúde física.
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}

	/**
	 * Verifica qual o estade de saúde geral do aluno.
	 * @return uma string que representa o status de saúde geral.
	 */
	public String getStatusGeral() {
		String status = "";
		if (this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
			status = "boa";
		} else if (this.saudeFisica.equals("boa") && this.saudeMental.equals("fraca")) {
			status = "ok";
		} else if (this.saudeFisica.equals("fraca") && this.saudeMental.equals("boa")) {
			status = "ok";
		} else {
			status = "fraca";
		}
		return status;
	}

}
