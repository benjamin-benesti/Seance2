package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {
        Collection<Conteneur> lesConteneurs = new ArrayList<>();

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