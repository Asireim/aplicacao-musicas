package br.com.alura.aplicacaomusica.principal;

import br.com.alura.aplicacaomusica.modelos.Album;
import br.com.alura.aplicacaomusica.modelos.Musica;

public class Principal {
    public static void main(String[] args) {
        Album centuryBreakdown = new Album();
        centuryBreakdown.setTitulo("21st Century Breakdown");
        centuryBreakdown.setArtista("Green Day");
        centuryBreakdown.setAnoLancamento(2009);

        Musica lastOfAmericanGirls = new Musica();
        lastOfAmericanGirls.setTitulo("Last of the american girls");
        lastOfAmericanGirls.setAlbum(centuryBreakdown);
        lastOfAmericanGirls.setGenero("Alterativa/indie");
        centuryBreakdown.adicionaMusica(lastOfAmericanGirls);

        for (int i = 0; i < 10; i++) {
            lastOfAmericanGirls.reproduzir();
        }

        System.out.println("Reproduções da música: " + lastOfAmericanGirls.getTotalReproducoes());
    }
}
