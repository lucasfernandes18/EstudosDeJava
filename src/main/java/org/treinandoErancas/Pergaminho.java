package org.treinandoErancas;

public class Pergaminho {
    private String pergaminho;

    public Pergaminho(String tamanho) {
        this.pergaminho = tamanho;
    }

    public String getTamanho() {
        return pergaminho;
    }

    @Override
    public String toString() {
        return "Shuriken de pergaminho: " + pergaminho;
    }
}
