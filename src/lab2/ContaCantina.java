package lab2;

public class ContaCantina {

	private String nomeDaCantina;
	private int qtdItens;
	private int valorCentavos;
	private int faltaPagar;

	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.qtdItens = 0;
		this.valorCentavos = 0;
		this.faltaPagar = 0;
	}

	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.faltaPagar += valorCentavos;
		this.valorCentavos += valorCentavos;
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
