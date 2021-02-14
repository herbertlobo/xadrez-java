package xadrez;

import tabuleiro.BordaDoTabuleiro;
import tabuleiro.PecaDeTabuleiro;

public class PartidaDoXadrez {

    private BordaDoTabuleiro borda;

    //Construtor cria o tabuleiro
    public PartidaDoXadrez() {
        borda = new BordaDoTabuleiro(8,8);
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat = new PecaDeXadrez[borda.getLin()][borda.getCol()];

        for(int i=0 ; i < borda.getLin(); i++){
            for(int j=0; j < borda.getCol(); j++){
                mat[i][j] = (PecaDeXadrez) borda.peca(i,j);
            }
        }
        return mat;
    }

}
