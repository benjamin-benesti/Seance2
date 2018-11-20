package fr.univamu.iut.exo2;


import fr.univamu.iut.Conteneur;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GestionDistances {

    public static HashMap<String, Integer> distance = new HashMap<>();
    static
    {
       distance.put("Alicante",399);
       distance.put("Barcelone",183);
       distance.put("Valence",337);
       distance.put("Malaga",599);

    }

   public static Integer getDistance (String ville)
   {
       return distance.get(ville);
   }

   public static Comparator<Conteneur> comparator = new Comparator<Conteneur>() {
        @Override
        public int compare(Conteneur o1, Conteneur o2) {

            return (o1.getDistance() - o2.getDistance());
        }
    };


}
