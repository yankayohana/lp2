package lab2;

public class Saude {
	private String saudeFisica;
	private String saudeMental;

	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}

	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}

	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}

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
