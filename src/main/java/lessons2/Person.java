package lessons2;

public class Person {

    private char sex;
    private String name;
    private int heigth;
    private int weight;
    private int age;

    public Person(char sex, String name, int heigth, int weight, int age) {
        this.sex = 'm';
        this.name = "Ivan";
        this.heigth = 179;
        this.weight = 78;
        this.age = 34;
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
