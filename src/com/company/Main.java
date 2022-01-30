package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        ArrayList<String> puzzle = new ArrayList<String>();
            Human [] persons= {
                    new Child( "Halk", 2, 5, 0.5),
                    new Adult("Edward", 22, 65, 49),
                    new Lightweight("Leopold", 18, 90, 250),
                    new Middleweight("Leonard", 12, 35, 23),
                    new Heavyweight("Oskar", 33, 76, 200)
            };
            for (Human i : persons) {
                String hello;
                hello = i.name.substring(0, 1);
                puzzle.add(hello);

                if (count <= persons.length) {
                    System.out.println("<======================================>");
                    System.out.println("Person number " + count);
                    i.generalInformation();
                    count++;
                }
            }
        System.out.println(puzzle);
    }
}
