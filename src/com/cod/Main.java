package com.cod;

public class Main {
    public static void main(String[] args) {
        Singleton miUnicaInstancia = Singleton.getInstance();

        miUnicaInstancia.setEdad(22);
        miUnicaInstancia.setNombre("Jose");

        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
        otraInstanciaSeraLaMisma.setEdad(58);

    }

}
