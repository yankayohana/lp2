package lab2;

/**
 * Essa Classe contém informações sobre as contas dos alunos nos laboratórios,
 * tais como: nome do laboratório, cota, e espaço utilizado.
 * 
 * @author Yanka Yohana, 116211079 - Laboratório de Programaçao 2
 */

public class ContaLaboratorio {

	/**
	 * String que representa o nome do laboratório.
	 */
	private String nome;

	/**
	 * Inteiro que representa o limite de espaço.
	 */
	private int cota;

	/**
	 * Inteiro que representa a quantidade de espaço utilizado.
	 */
	private int espacoUtilizado;

	/**
	 * Constrói uma conta no laboratório a partir do nome do laboratório.
	 * 
	 * @param nome
	 */
	public ContaLaboratorio(String nome) {
		this(nome, 2000);
	}

	/**
	 * Constrói uma conta no laboratório a partir do nome do laboratório e de uma
	 * cota.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nome = nomeLaboratorio;
		this.cota = cota;
	}

	/**
	 * Adiciona espaço utilizado na conta.
	 * 
	 * @param mbytes cota medida em mb
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoUtilizado += mbytes;
	}

	/**
	 * Libera espaço na conta.
	 * 
	 * @param mbytes cota medida em mb
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoUtilizado -= mbytes;
	}

	/**
	 * verifica se o aluno atingiu a cota de espaço.
	 * 
	 * @return
	 */
	public boolean atingiuCota() {
		boolean atingiu = false;
		if (espacoUtilizado >= cota) {
			atingiu = true;
		}
		return atingiu;
	}

	public String toString() {
		return this.nome + " " + this.espacoUtilizado + "/" + this.cota;
	}

}