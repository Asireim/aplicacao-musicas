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

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() { return this.artista; }

    public int getAnoLancamento() { return this.anoLancamento; }

    public int getDuracaoEmMinutos() { return this.duracaoEmMinutos; }

    protected void setArtista(String artista) {
        this.artista = artista;
    }

    protected void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void criarAlbum(String titulo,String artista, int anoLancamento) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setAnoLancamento(anoLancamento);
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

    public void imprimeFichaTecnica() {
        System.out.printf("""
                        Ficha técnica do álbum %s:
                        
                        Nome do álbum: %s
                        Artista: %s
                        Ano de lançamento: %d
                        Duração total em minutos: %d
                        Gêneros do álbum:
                        """, this.getTitulo(), this.getTitulo(), this.getArtista(), this.getAnoLancamento(), this.getDuracaoEmMinutos());
        for (int i = 0; i < generos.size(); i++) {
            System.out.println(generos.get(i));
        }
    }

    public void mostrarMusicas() {
        System.out.printf("Músicas do álbum %s:\n", this.getTitulo());
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
