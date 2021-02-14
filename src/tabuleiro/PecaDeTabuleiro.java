package tabuleiro;

public class PecaDeTabuleiro {

    protected Posicao posicao;
    private BordaDoTabuleiro borda;

    //construtor
    public PecaDeTabuleiro(BordaDoTabuleiro borda) {
        this.borda = borda;
        posicao = null;
    }
    //gets e Sets
    protected BordaDoTabuleiro getBorda() {
        return borda;
    }

}
