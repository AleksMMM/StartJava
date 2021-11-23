package com.startjava.lesson_2_3.game;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    private int[] numberArray;
    private int chansPlayer;
    Scanner console;

    public Player(String name) {
       this.name = name;
       this.numberArray = new int[10];
    }

    public void arraysNew(Player player) {
        if (player.chansPlayer < 9) {
            for (Integer in: player.numberArray) {
                System.out.print(in + " ");
            }
        } else {
            for (Integer in: player.numberArray) {
                System.out.print(in + " ");
            }
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(int number) {
        numberArray[chansPlayer] = number;
    }

    public int getChansPlayer() {
        return chansPlayer;
    }

    public void setChansPlayer(int chansPlayer) {
        this.chansPlayer = chansPlayer;
    }
}
