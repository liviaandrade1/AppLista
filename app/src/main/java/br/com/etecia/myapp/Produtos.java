package br.com.etecia.myapp;

public class Produtos {
private String Titulo;
private int imagem;

//criando o construtor

    public Produtos(String titulo, int imagem) {
        Titulo = titulo;
        this.imagem = imagem;
    }
    //craindo o getter and setter

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
