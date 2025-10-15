package br.com.alura.aplicacaomusica.modelos;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private List<Musica> musicas = new ArrayList<>();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void adicionaMusica(Musica musica) {
        this.musicas.add(musica);
    }
}
