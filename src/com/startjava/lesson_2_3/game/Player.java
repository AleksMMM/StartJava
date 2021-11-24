package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getNumbers(int attempt) {
        return numbers[attempt];
    }

    public void setNumber(int answer) {
        numbers[attempt] = answer;
        attempt++;
    }

    public void initNumbers() {
        Arrays.fill(numbers, -1);
        attempt = 0;
    }

    public int[] printPlayerAnswer(int attempt) {
        return Arrays.copyOf(numbers, attempt);
    }
}