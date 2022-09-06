package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList(16);
        List <String> nomes2 = new ArrayList(16);
        nomes.add("Roberto");
        nomes.add("DevDojo");
        nomes2.add("Bomfim");
        nomes2.add("Java virado no Jiraya");

        //System.out.println(nomes.remove("Roberto"));

        nomes.addAll(nomes2);

        for(Object nome : nomes){
            System.out.println(nome);
        }

        System.out.println("------------");

        int size = nomes.size();
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List <Integer> numeros = new ArrayList<>();
        numeros.add(3);
    }
}
