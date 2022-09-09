package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 10.5, 0));
        mangas.add(new Manga(4L,"Berserk", 15.70, 5));
        mangas.add(new Manga(8L,"Hellsing Ultimate", 20, 0));
        mangas.add(new Manga(7L, "Pokemon", 35.60, 2));
        mangas.add(new Manga(6L, "Dragon ball z", 40.10, 0));

        /*Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            if(mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }*/

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
