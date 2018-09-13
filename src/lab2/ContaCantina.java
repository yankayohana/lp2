package lab2;

/**
 * Essa Classe representa as contas dos alunos nas cantinas.
 * 
 * @author Yanka Yohana - Laboratório de Programaçao 2
 */
public class ContaCantina {
	
	/**
	 * String que representa o nome da cantina.
	 */
	private String nomeDaCantina;
	
	/**
	 * Inteiro que representa a quantidade de itens adquiridos.
	 */
	private int qtdItens;
	
	/**
	 * Inteiro que representa o valor gasto em centavos.
	 */
	private int valorCentavos;
	
	/**
	 * Inteiro que representa o valor que falta pagar.
	 */
	private int faltaPagar;	
	
	/**
	 * Constrói uma conta na cantina a partir do: nome da cantina, quantidade de itens, valor em centavos,
	 * o valor que falta pagar e lanches.
	 * @param nomeDaCantina, uma string.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.qtdItens = 0;
		this.valorCentavos = 0;
		this.faltaPagar = 0; 
	}
	
	/**
	 * Cadastra a quantidade de itens e o valor.
	 * @param qtdItens um inteiro que representa a quantidade de itens.
	 * @param valorCentavos um inteiro que representa o valor em centavos.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.faltaPagar += valorCentavos;
		this.valorCentavos += valorCentavos;
	}
	
	/**
	 * Diminui de faltaPagar o valor em centavos.
	 * @param valorCentavos um inteiro que representa o valor em centavos.
	 */
	public void pagaConta(int valorCentavos) {
		this.faltaPagar -= valorCentavos;
	}
	
	/**
	 * Retorna a quantidade de dinheiro, em centavos, que o usuário falta pagar.
	 * @return um inteiro que representa quanto falta pagar.
	 */
	public int getFaltaPagar() {
		return this.faltaPagar;
	}
	
	/**
	 * Retorna a string que representa a conta na cantina.
	 */
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}

}
