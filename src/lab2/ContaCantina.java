package lab2;

import java.util.ArrayList;

/**
 * Essa Classe representa as contas dos alunos nas cantinas.
 * 
 * @author Yanka Yohana, 116211079 - Laboratório de Programaçao 2
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
	 * Um Array que guarda lanches.
	 */
	private ArrayList<Lanches> lanches;
	
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
		this.lanches = new ArrayList<Lanches>(); 
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
	 * Método extra, cadastra a quantidade de itens, valor e os detalhes do lanche.
	 * @param qtdItens um inteiro que representa a quantidade de itens.
	 * @param valorCentavos um inteiro que representa o valor em centavos.
	 * @param detalhes uma string que representa os detalhes do lanche.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.valorCentavos = valorCentavos;
		Lanches lanche = new Lanches(detalhes, qtdItens);
		this.lanches.add(lanche); 
	}
	
	/**
	 * Forma uma String com os ultimos 5 detalhes do lanche.
	 * @return uma string com os ultimos detalhes.
	 */
	public String listarDetalhes() {
		String ultimosDetalhes = "";
		for (int i = lanches.size() - 5; i < lanches.size(); i ++) {
			ultimosDetalhes += lanches.get(i).getDetalhes();
		}
		return ultimosDetalhes;
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
