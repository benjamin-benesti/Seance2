package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {
        TreeSet<Conteneur> lesConteneurs = new TreeSet<Conteneur>(GestionDistances.comparator);

        try (FileInputStream fis = new FileInputStream(fichier);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
            try {
                while (true) {
                    Conteneur conteneur = (Conteneur) ois.readObject();
                    lesConteneurs.add(conteneur);
                }
            }catch (EOFException e)
            {

            }





        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return lesConteneurs;
    }
}