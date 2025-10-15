package br.com.alura.aplicacaomusica.modelos;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private List<Musica> musicas = new ArrayList<>();
    private List<String> generos = new ArrayList<>();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void adicionaMusica(Musica musica) {
        this.musicas.add(musica);
        this.generos.add(musica.getGenero());
//        for (int i = 0; i < generos.size(); i++) {
//            if (generos.get(i).equals(musica.getGenero())) {
//                System.out.println("Genero já existente.");
//            } else {
//                System.out.println("genero adicionado");
//                this.generos.add(musica.getGenero());
//            }
//        }
        this.duracaoEmMinutos += musica.getDuracaoEmMinutos();
    }

    public void imprimeFichaTecnica() {
        System.out.println("Nome do álbum: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Duração total em minutos: " + this.duracaoEmMinutos);
        System.out.println("Gêneros do álbum: ");
        for (int i = 0; i < generos.size(); i++) {
            System.out.println(generos.get(i));
        }
    }

    public void mostrarMusicas() {
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println(musicas.get(i).getTitulo());
        }
    }
}
