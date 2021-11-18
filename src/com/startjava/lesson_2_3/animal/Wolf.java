package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public Wolf(String sex, String name, int weight, int age, String color) {
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Wolf() {

    }

    public void go() {
        System.out.println(name + " идет");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void hovl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name + " охотится");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
