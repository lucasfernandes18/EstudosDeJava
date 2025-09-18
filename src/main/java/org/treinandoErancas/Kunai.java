package org.treinandoErancas;

public class Kunai {    private String tribo;

    public Kunai(String tribo) {
        this.tribo = tribo;
    }

    public String getTamanho() {
        return tribo;
    }

    @Override
    public String toString() {
        return "Kunai de tribo: " + tribo;
    }
}



