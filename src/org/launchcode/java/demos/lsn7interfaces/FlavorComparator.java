package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2)  {
        int num1 = flavor1.getAllergens().size();
        int num2 = flavor2.getAllergens().size();
        return num1 - num2;
    }
}
