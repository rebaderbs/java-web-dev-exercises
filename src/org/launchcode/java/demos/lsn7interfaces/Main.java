package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args){
        Case allItems = new Case();
        ArrayList<Flavor> flavors = allItems.getFlavors();
        ArrayList<Cone> cones = allItems.getCones();
        Comparator<Flavor> comp1 = new FlavorComparator();
        Comparator<Cone> comp2 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(comp1);


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(comp2);


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors)   {
            System.out.println(flavor);
        }

        for (Cone cone: cones)  {
            System.out.println(cone);
        }

    }
}
