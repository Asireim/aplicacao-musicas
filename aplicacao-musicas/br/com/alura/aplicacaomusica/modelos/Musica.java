package br.com.alura.aplicacaomusica.modelos;

public class Musica extends Audio {
    private Album album;
    private String genero;

    public String getGenero() {
        return this.genero;
    }

    public Musica(String nomeDaMusica, int duracaoEmMinutos, String genero, Album album) {
        super(nomeDaMusica, duracaoEmMinutos);
        this.genero = genero;
        this.album = album;
        album.adicionaMusica(this);
        System.out.printf("""
                        A música %s do album %s possui a duração total de %d minutos e pertence ao gênero %s.
                        """, super.titulo, this.album.getTitulo(), super.duracaoEmMinutos, this.genero);
    }
}
