package tabuleiro;

public class Posicao {

    private int lin;
    private int col;

    //construtor
    public Posicao(int lin, int col) {
        this.lin = lin;
        this.col = col;
    }

    //gets e sets
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
    // toString
    @Override
    public String toString() {
        return lin +" , " + col;
    }

    // metodos


}
