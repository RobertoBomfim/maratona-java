package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMIE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Irineu");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Lonzo");
        ferrari.imprime();
    }
}