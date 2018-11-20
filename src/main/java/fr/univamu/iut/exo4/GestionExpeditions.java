package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.Lecteur;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GestionExpeditions {

    public static void main(String[] args) {

        PriorityQueue<Conteneur> p = new PriorityQueue<Conteneur>(new Compar());
        p.addAll(Lecteur.charger("Conteneurs.ser"));


    }
}

public class Compar implements Comparator<Conteneur>
{
    public int compare(Conteneur c1,Conteneur c2)
    {
      return c1.getPoids() - c2.getPoids();
    }
}

