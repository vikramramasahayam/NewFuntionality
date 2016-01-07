package com.features;

public class Main {

    // private static int numberOfProcessors = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        Double d1 = Double.NaN;
        Double d2 = Double.NaN;

        if (d1 == d2) {
            System.out.println("d1 and d2 are == ");
        } else {
            System.out.println("d1 and d2 are not == ");
        }

        if (d1.equals(d2)) {
            System.out.println("d1 and d2 are equal");
        } else {
            System.out.println("d1 and d2 are not equal ");
        }

        if (Double.compare(d1, d2) == 0) {
            System.out.println("d1 and d2 are comapre equal");
        } else {
            System.out.println("d1 and d2 are not compare equal");
        }

    }

}
