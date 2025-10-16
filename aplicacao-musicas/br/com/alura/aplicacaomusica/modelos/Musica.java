package br.com.alura.aplicacaomusica.modelos;

public class Musica extends Audio {
    private Album album;
    private String genero;

    protected void setAlbum(Album album) {
        this.album = album;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeAlbum() {
        return this.album.getTitulo();
    }

    public String getGenero() {
        return this.genero;
    }

    public void criarMusica(String nomeDaMusica, int duracaoEmMinutos, String genero, Album album) {
        this.setTitulo(nomeDaMusica);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
        this.setGenero(genero);
        this.setAlbum(album);
        album.adicionaMusica(this);
        System.out.printf("""
                        A música %s do album %s possui a duração total de %d minutos e pertence ao gênero %s.
                        """, this.getTitulo(), this.getNomeAlbum(), this.getDuracaoEmMinutos(), this.getGenero());
    }
}
