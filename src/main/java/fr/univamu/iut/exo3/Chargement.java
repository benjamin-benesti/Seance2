package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class Chargement
{


    public static ArrayDeque<Conteneur> TransfoListe (Collection<Conteneur> liste)
    {
        ArrayDeque<Conteneur> newliste = new ArrayDeque<>();
        for (Conteneur e: liste)
        {
            newliste.addLast(e);
        }
        return newliste;
    }

    public static void embarquer(Conteneur e, ArrayDeque<Conteneur> newliste)
    {
        newliste.addFirst(e);
    }

    public static void debarquer(ArrayDeque<Conteneur> newliste)
    {
        newliste.removeFirst();
    }
}
