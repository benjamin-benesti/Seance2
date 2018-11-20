package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;
import java.util.Collection;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        Collection<Conteneur> liste = new ArrayList<>();
        liste = Lecteur.charger("Conteneurs.ser");
        System.out.println(liste.toString());
    }
}
