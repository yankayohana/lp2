package lab2;

import java.util.ArrayList;

/**
 * Essa Classe representa as contas dos alunos nas cantinas.
 * 
 * @author Yanka Yohana
 */
public class ContaCantina {

	private String nomeDaCantina;
	private int qtdItens;
	private int valorCentavos;
	private int faltaPagar;
	private ArrayList<Lanches> lanches;

	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.qtdItens = 0;
		this.valorCentavos = 0;
		this.faltaPagar = 0;
		this.lanches = new ArrayList<Lanches>(); 
	}

	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.faltaPagar += valorCentavos;
		this.valorCentavos += valorCentavos;
	}
	
	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		this.valorCentavos = valorCentavos;
		Lanches lanche = new Lanches(detalhes, qtdItens);
		this.lanches.add(lanche); 
	}
	public String listarDetalhes() {
		String ultimosDetalhes = "";
		for (int i = lanches.size() - 5; i < lanches.size(); i ++) {
			ultimosDetalhes += lanches.get(i).getDetalhes();
		}
		return ultimosDetalhes;
	}

	public void pagaConta(int valorCentavos) {
		this.faltaPagar -= valorCentavos;
	}

	public int getFaltaPagar() {
		return this.faltaPagar;
	}

	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}

}
