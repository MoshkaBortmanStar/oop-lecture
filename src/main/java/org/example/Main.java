package org.example;

import org.example.oop.Brain;
import org.example.oop.Human;

public class Main {



    public static void main(String[] args) {
        var human1 = Human.builder().name("John").brain(new Brain(100)).build();

        var human2 = Human.builder().name("John").build();
        var brain = human1.getBrain();
        brain.setSize(1000);
        human2.setBrain(brain);

        System.out.println(human1);
        System.out.println(human2);


    }
}