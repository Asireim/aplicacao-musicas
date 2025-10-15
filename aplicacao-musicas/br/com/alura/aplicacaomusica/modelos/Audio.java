package br.com.alura.aplicacaomusica.modelos;

public class Audio implements Classificavel {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public double getClassificacao() {
        return this.classificacao;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    @Override
    public void classificar(double nota) {
        this.classificacao += nota;
    }

}
