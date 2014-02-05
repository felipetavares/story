class Personagem {
	private String  nome = "";
	private Arma 	arma = null;

	public Personagem (String nome) {
		this.nome = nome;
	}

	public String getNome () {
		return nome;
	}

	public void setArma (Arma arma) {
		this.arma = arma;
	}

	public Arma getArma () {
		return arma;
	}
}