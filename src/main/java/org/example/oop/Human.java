package org.example.oop;


import lombok.Builder;

@Builder
public class Human {

    private Brain brain;
    private String name;

    public String toString() {
        return "Human(name=" + this.name + ")" + " with brain size: " + brain.getSize();
    }


    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
}
