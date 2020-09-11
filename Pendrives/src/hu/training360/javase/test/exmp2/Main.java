package hu.training360.javase.test.exmp2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pendrive pdr = new Pendrive("eredeti", 32, 100);
        Pendrive opdr = new Pendrive("eredeti", 64, 300);
        System.out.println(pdr.cheaperThan(opdr));
        System.out.println(pdr.comparePricePerCapacity(opdr));

        List<Pendrive> plist = new ArrayList<>();
        plist.add(pdr);
        plist.add(opdr);

        Pendrives pdrs = new Pendrives();
        System.out.println(pdrs.best(plist));
        System.out.println(pdrs.cheapest(plist));
    }
}
