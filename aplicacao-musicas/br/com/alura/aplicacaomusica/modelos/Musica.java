package br.com.alura.aplicacaomusica.modelos;

public class Musica extends Audio {
    private Album album;
    private String genero;

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return this.album.getTitulo();
    }

    public String getGenero() {
        return this.genero;
    }
}
