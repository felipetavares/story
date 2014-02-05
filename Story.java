import javax.swing.JOptionPane;

class Story {
	public static void main (String args[]) {
		System.out.println ("Aventura na Terra dos Orcs / Ep 01 \\");

		Story story = new Story();
	}

	public Story () {
		Personagem jogador = new Personagem(JOptionPane.showInputDialog(null,"Seu nome."));
		
		JOptionPane.showMessageDialog(null, "Bem vindo(a), "+jogador.getNome()+"!");

		String nomeArma = null;
		String ataque = null;

		do {
			nomeArma = JOptionPane.showInputDialog(null, "Escolha sua arma: cajado/colt/espada");
		} while (!nomeArma.equals("cajado") && !nomeArma.equals("colt") && !nomeArma.equals("espada"));
		
		Arma arma = null;

		switch (nomeArma) {
			case "cajado":
				arma = new Cajado();
				break;
			case "colt":
				arma = new Colt();
				break;
			case "espada":
				arma = new Espada();
				break;
		}

		jogador.setArma(arma);

		JOptionPane.showMessageDialog(null, "Você está caminhando por uma estreita estrada...");
		JOptionPane.showMessageDialog(null, "os pássaros cantam pelas margens...");
		JOptionPane.showMessageDialog(null, "e os picos das montanhas erguem-se ao longe.");

		JOptionPane.showMessageDialog(null, "Mas, de repente e sem aviso, um Orc aparece à sua frente!");
		JOptionPane.showMessageDialog(null, "Você segura firmemente sua arma, "+jogador.getArma().getNome());

		JOptionPane.showMessageDialog(null, "O Orc, com uma voz grave, e sedento por sangue, diz:");
		JOptionPane.showMessageDialog(null, "\""+jogador.getNome()+", este é o teu fim!");

		JOptionPane.showMessageDialog(null, "Você retruca:");
		JOptionPane.showMessageDialog(null, "\"Não tenha tanta certeza...\"");

		do {
			ataque = JOptionPane.showInputDialog(null, "Você deseja utilizar qual ataque? prim/sec");
		} while (!ataque.equals("prim") && !ataque.equals("sec"));

		if (ataque.equals("prim")) {
			JOptionPane.showMessageDialog(null, "Você ataca, "+jogador.getArma().getUso());
		} else {
			JOptionPane.showMessageDialog(null, "Você ataca, "+jogador.getArma().getUsoSecundario());
			JOptionPane.showMessageDialog(null, "O orc se afasta, mas já se prepara para atacar novamente.");
			JOptionPane.showMessageDialog(null, "Você ataca, pela segunda vez, "+jogador.getArma().getUsoSecundario());
		}

		JOptionPane.showMessageDialog(null, "O Orc cai, ferido mortalmente, e diz em suas últimas palavras");
		JOptionPane.showMessageDialog(null, "\"Obrigado por me livrar da mal.. maldi... Ahh!\"");
		JOptionPane.showMessageDialog(null, "Uma aventura interativa, por Felipe Tavares, Fernanda Marinheiro, Luana Dantas e Gabriela Garcia");
		JOptionPane.showMessageDialog(null, "Esperem o próximo episódio de 'Aventura na terra dos Orcs'...");
	}
}