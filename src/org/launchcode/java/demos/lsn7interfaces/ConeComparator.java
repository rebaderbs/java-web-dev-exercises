package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() - cone2.getCost() < 0){
            return -1;
        } else if (cone1.getCost() - cone2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
//    public int compare(Cone cone1, Cone cone2) {
//        double price = cone1.getCost() - cone2.getCost();
//        if (price > 0)  {
//            return 1;
//        } else if (price == 0)  {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
}
