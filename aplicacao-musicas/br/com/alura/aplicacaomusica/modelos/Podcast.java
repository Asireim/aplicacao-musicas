package br.com.alura.aplicacaomusica.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private int numeroEpisodio;
    private String tema;
    private String convidado;
    private String descricao;

    protected void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    protected void setTema(String tema) {
        this.tema = tema;
    }

    protected void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getApresentador() {
        return this.apresentador;
    }

    public int getNumeroEpisodio() {
        return this.numeroEpisodio;
    }

    public String getTema() {
        return this.tema;
    }

    public String getConvidado() {
        return this.convidado;
    }

    public void criarPodcast(String tituloEp, int duracaoEmMinutos, String apresentador, int numeroEpisodio, String temaDoEp, String nomeConvidado, String descricao) {
        this.setTitulo(tituloEp);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
        this.setApresentador(apresentador);
        this.setNumeroEpisodio(numeroEpisodio);
        this.setTema(temaDoEp);
        this.setConvidado(nomeConvidado);
        this.setDescricao(descricao);
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
                """, this.getTitulo(), this.getDuracaoEmMinutos(), this.getApresentador(), this.getNumeroEpisodio(), this.getTema(), this.getConvidado(), this.getDescricao());
    }
}
