package br.com.alura.aplicacaomusica.modelos;

public class Musica extends Audio {
    private Album album;
    private String artista;
    private String genero;

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtista() {
        return this.artista;
    }

    public String getGenero() {
        return this.genero;
    }
}
