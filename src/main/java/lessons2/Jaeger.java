package lessons2;

import org.jetbrains.annotations.NotNull;

public class Jaeger {

    private String name;
    private int weight;
    private int height;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String name, int weight, int height, int speed, int strength, int armor) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void voice(Jaeger jaeger) {
        System.out.println(jaeger.name + " зовет на помощь");
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
