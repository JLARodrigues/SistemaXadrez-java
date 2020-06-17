package xadrez.pecas;

import corpojogo.Tabuleiro;
import xadrez.PecaXadrez;
import xadrez.Cor;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
    
	@Override
	public String toString() {
		return "T";
	}
}
