package br.com.alura.aplicacaomusica.modelos;

public class Audio implements Playable, Rateable {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalReproducoes;
    private double estrelas;
    private int avaliacoes;

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    protected void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    @Override
    public void reproduzir(int vezes) {
        for (int i = 0; i < vezes; i++) {
            this.totalReproducoes++;
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
