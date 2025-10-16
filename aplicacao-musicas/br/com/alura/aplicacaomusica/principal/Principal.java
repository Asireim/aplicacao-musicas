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
        lastOfAmericanGirls.setDuracaoEmMinutos(4);
        lastOfAmericanGirls.setGenero("Alterativa/indie");
        lastOfAmericanGirls.setAlbum(centuryBreakdown);
        centuryBreakdown.adicionaMusica(lastOfAmericanGirls);
        lastOfAmericanGirls.curtir();
        lastOfAmericanGirls.curtir();
        for (int i = 0; i < 10; i++) {
            lastOfAmericanGirls.reproduzir();
        }
        System.out.println("A música " + lastOfAmericanGirls.getTitulo() + " possui " + lastOfAmericanGirls.getCurtidas() + " curtidas e " + lastOfAmericanGirls.getTotalReproducoes() + " reproducoes.");

        Musica vivaLaGloria = new Musica();
        vivaLaGloria.setTitulo("¡Viva La Gloria!");
        vivaLaGloria.setDuracaoEmMinutos(3);
        vivaLaGloria.setGenero("Alterativa/indie");
        vivaLaGloria.setAlbum(centuryBreakdown);
        centuryBreakdown.adicionaMusica(vivaLaGloria);
        vivaLaGloria.curtir();
        vivaLaGloria.curtir();
        for (int i = 0; i < 6; i++) {
            vivaLaGloria.reproduzir();
        }
        System.out.println("A música " + vivaLaGloria.getTitulo() + " possui " + vivaLaGloria.getCurtidas() + " curtidas e " + vivaLaGloria.getTotalReproducoes() + " reproduções.");

        Musica lastNightOnEarth = new Musica();
        lastNightOnEarth.setTitulo("Last Night On Earth");
        lastNightOnEarth.setDuracaoEmMinutos(4);
        lastNightOnEarth.setGenero("Pop rock");

        System.out.println("Ficha técnica do álbum " + centuryBreakdown.getTitulo() + ": ");
        centuryBreakdown.imprimeFichaTecnica();
        System.out.println("Músicas do álbum " + centuryBreakdown.getTitulo() + ": ");
        centuryBreakdown.mostrarMusicas();
        System.out.println("Reproduções da música " + lastOfAmericanGirls.getTitulo() + ": " + lastOfAmericanGirls.getTotalReproducoes());
        System.out.println("Reproduções da música " + vivaLaGloria.getTitulo() + ": " + vivaLaGloria.getTotalReproducoes());
    }
}
