package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("m", "wolf1", 12, 8, "black");
        Wolf wolf2 = new Wolf();

        wolf2.setSex("w");
        wolf2.setName("wolf2");
        wolf2.setWeight(23);
        wolf2.setAge(7);
        wolf2.setColor("white");

        System.out.println(wolf2.getSex());
        System.out.println(wolf2.getName());
        System.out.println(wolf2.getAge());
        System.out.println(wolf2.getWeight());
        System.out.println(wolf2.getColor());
        System.out.println();
        System.out.println(wolf);

        wolf.go();
        wolf.run();
        wolf.hovl();
        wolf.hunt();
    }
}
