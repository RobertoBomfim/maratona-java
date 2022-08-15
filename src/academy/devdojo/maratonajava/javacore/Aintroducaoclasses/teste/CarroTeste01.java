package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Black Noir";
        carro1.modelo = "S10";
        carro1.ano = 2021;

        carro2.nome = "Arsenal";
        carro2.modelo = "Hilux";
        carro2.ano = 2022;

        System.out.println("Carro1: " + carro1.nome + " - " + carro1.modelo + " - " + carro1.ano);
        System.out.println("Carro2: " + carro2.nome + " - " + carro2.modelo + " - " + carro2.ano);
    }
}
