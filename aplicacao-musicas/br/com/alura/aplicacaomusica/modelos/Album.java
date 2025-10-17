package br.com.alura.aplicacaomusica.modelos;

import java.util.ArrayList;
import java.util.List;

public class Album implements Rateable {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private double estrelas;
    private int avaliacoes;
    private List<Musica> musicas = new ArrayList<>();
    private List<String> generos = new ArrayList<>();

    public Album(String titulo,String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void adicionaMusica(Musica musica) {
        this.musicas.add(musica);
        if (this.generos.contains(musica.getGenero().toLowerCase())) {
            System.out.println("Genero já existente.");
        } else {
            this.generos.add(musica.getGenero().toLowerCase());
        }
        this.duracaoEmMinutos += musica.getDuracaoEmMinutos();
    }

    private int getReproducoes() {
        int reproducoes = 0;

        for (int i = 0; i < musicas.size(); i++) {
            reproducoes += musicas.get(i).getTotalReproducoes();
        }

        return reproducoes;
    }

    public void imprimeFichaTecnica() {
        System.out.printf("""
                        Ficha técnica do álbum %s:
                        
                        Nome do álbum: %s
                        Artista: %s
                        Ano de lançamento: %d
                        Duração total em minutos: %d
                        Total de reproduções do álbum: %d
                        Gêneros do álbum:
                        """, this.getTitulo(), this.getTitulo(), this.artista, this.anoLancamento, this.duracaoEmMinutos, this.getReproducoes());
        for (int i = 0; i < generos.size(); i++) {
            System.out.println(generos.get(i));
        }
    }

    public void mostrarMusicas() {
        System.out.printf("Músicas do álbum %s:%n", this.getTitulo());
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println(musicas.get(i).getTitulo());
        }
    }

    @Override
    public void avaliar(double estrelas) {
        this.avaliacoes++;
        this.estrelas += estrelas;
    }

    @Override
    public void verificarAvaliacao() {
        double avaliacao = (this.estrelas / this.avaliacoes);
        System.out.printf("Avaliação: %.1f estrelas", avaliacao);
    }
}
