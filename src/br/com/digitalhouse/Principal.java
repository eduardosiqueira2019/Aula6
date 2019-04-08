package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bidu","20","Vira-lata");

        System.out.println("Esse cachorro é mamífero ? " + cachorro.ehMamifero());
    }
}
