package tabuleiro;

public class BordaDoTabuleiro {

    private int lin;                    //linha
    private int col;                    //coluna
    private PecaDeTabuleiro[][] pecas;  //peças

    //construtor vai adicionar uma unica peça no tabuleiro por vez
    public BordaDoTabuleiro(int lin, int col) {
        this.lin = lin;
        this.col = col;
        pecas = new PecaDeTabuleiro[lin][col];
    }
    // Gets e Sets
    public int getLin() {
        return lin;
    }

    public void setLin(int lin) {
        this.lin = lin;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    //metodos
    // uma peça recebe uma linha e coluna
    public PecaDeTabuleiro peca(int linha, int coluna){
        return pecas[linha][coluna];
    }
    // uma peça recebe uma posição
    public PecaDeTabuleiro peca(Posicao posicao){
        return pecas[posicao.getLin()][posicao.getCol()];
    }
}
