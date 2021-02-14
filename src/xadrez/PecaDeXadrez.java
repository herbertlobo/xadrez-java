package xadrez;

import tabuleiro.BordaDoTabuleiro;
import tabuleiro.PecaDeTabuleiro;

import java.nio.charset.CoderResult;

public class PecaDeXadrez extends PecaDeTabuleiro {

    private Cor cor;

    //Construtor
    public PecaDeXadrez(BordaDoTabuleiro borda, Cor cor) {
        super(borda);
        this.cor = cor;
    }
    //Gets e Sets
    public Cor getCor() {
        return cor;
    }


}
