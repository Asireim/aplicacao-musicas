package br.com.alura.aplicacaomusica.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private int numeroEpisodio;
    private String tema;
    private String convidado;
    private String descricao;

    public Podcast(String tituloEp, int duracaoEmMinutos, String apresentador, int numeroEpisodio, String temaDoEp, String nomeConvidado, String descricao) {
        super(tituloEp, duracaoEmMinutos);
        this.apresentador = apresentador;
        this.numeroEpisodio = numeroEpisodio;
        this.tema = temaDoEp;
        this.convidado = nomeConvidado;
        this.descricao = descricao;
    }

    public void exibeFichaTecnica() {
        System.out.printf("""
                Informações do podcast:
                
                Título do episódio: %s
                Duração em minutos: %d
                Apresentador: %s
                Número do episódio: %d
                Tema do episódio: %s
                Nome do convidado: %s
                Descrição do episódio: %s
                """, super.titulo, super.duracaoEmMinutos, this.apresentador, this.numeroEpisodio, this.tema, this.convidado, this.descricao);
    }
}
