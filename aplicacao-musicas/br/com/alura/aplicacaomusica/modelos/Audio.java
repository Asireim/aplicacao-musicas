package br.com.alura.aplicacaomusica.modelos;

public class Audio implements Playable, Rateable {
    protected String titulo;
    protected int duracaoEmMinutos;
    private int totalReproducoes;
    private double estrelas;
    private int avaliacoes;

    public Audio(String nome, int duracaoEmMinutos) {
        this.titulo = nome;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public void reproduzir(int vezes) {
        for (int i = 0; i < vezes; i++) {
            this.totalReproducoes++;
        }
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public void verTotalReproducoes() {
        System.out.printf("Total de reproduções da música %s: %d%n", this.titulo, this.totalReproducoes);
    }

    @Override
    public void avaliar(double estrelas) {
        this.avaliacoes++;
        this.estrelas += estrelas;
    }

    @Override
    public void verificarAvaliacao() {
        double avaliacao = (this.estrelas / this.avaliacoes);
        System.out.printf("Avaliação: %.1f estrelas%n", avaliacao);
    }
}
