package lessons2;

public class Person {

    private char sex;
    private String name;
    private int heigth;
    private int weight;
    private int age;

    public Person(char sex, String name, int heigth, int weight, int age) {
        this.sex = sex;
        this.name = name;
        this.heigth = heigth;
        this.weight = weight;
        this.age = age;
    }

    public void seat() {
        System.out.println("человек сидит");
    }

    public void go() {
        System.out.println("человек идет");
    }

    public String run() {
        return " человек бежит";
    }

    public void say() {
        System.out.println("человек говорит");
    }

    public void teachJava() {
        System.out.println("человек учит Джава");
    }

}
