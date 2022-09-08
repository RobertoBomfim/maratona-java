package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on titan", 10.5));
        mangas.add(new Manga(4L,"Berserk", 15.70));
        mangas.add(new Manga(8L,"Hellsing Ultimate", 20));
        mangas.add(new Manga(7L, "Pokemon", 35.60));
        mangas.add(new Manga(6L, "Dragon ball z", 40.10));

        //Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

       Manga mangaToSearch = new Manga(6L, "Dragon ball z", 40.10);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
