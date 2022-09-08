package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 10.5));
        mangas.add(new Manga(4L,"Berserk", 15.70));
        mangas.add(new Manga(8L,"Hellsing Ultimate", 20));
        mangas.add(new Manga(7L, "Pokemon", 35.60));
        mangas.add(new Manga(6L, "Dragon ball z", 40.10));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
