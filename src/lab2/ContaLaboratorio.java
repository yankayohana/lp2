package lab2;

public class ContaLaboratorio {

	private String nome;
	private int cota;
	private int espacoUtilizado;

	public ContaLaboratorio(String nome) {
		this.nome = nome;
		this.cota = 2000;
	}

	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nome = nomeLaboratorio;
		this.cota = cota;
	}

	public void consomeEspaco(int mbytes) {
		this.espacoUtilizado += mbytes;
	}

	public void liberaEspaco(int mbytes) {
		this.espacoUtilizado -= mbytes;
	}

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