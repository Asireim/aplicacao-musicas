package br.com.alura.aplicacaomusica.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getApresentador() {
        return this.apresentador;
    }
}
