package app;

import tabuleiro.BordaDoTabuleiro;
import tabuleiro.Posicao;
import xadrez.PartidaDoXadrez;

public class xadrez {

    public static void main(String[] args) {

        PartidaDoXadrez partida = new PartidaDoXadrez();
        Ui.printBorda(partida.getPecas());
    }
}
