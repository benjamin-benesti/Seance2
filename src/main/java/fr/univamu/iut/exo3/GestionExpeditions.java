package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.Lecteur;

import java.util.ArrayDeque;
import java.util.Deque;

public class GestionExpeditions {
    public static void main(String[] args) {



        ArrayDeque<Conteneur> d = Chargement.TransfoListe(Lecteur.charger("Conteneurs.ser"));
        System.out.println(d.toString());

        Conteneur c = new Conteneur("Marocco",560,"Maroc");

        Chargement.embarquer(c,d);
        System.out.println(d.toString());

        Chargement.debarquer(d);
        System.out.println(d.toString());




    }
}
