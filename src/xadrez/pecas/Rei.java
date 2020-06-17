package xadrez.pecas;

import corpojogo.Tabuleiro;
import xadrez.PecaXadrez;
import xadrez.Cor;

public class Rei extends PecaXadrez {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
