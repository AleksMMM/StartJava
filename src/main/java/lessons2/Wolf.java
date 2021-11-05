package lessons2;

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

    public void go() {
        System.out.println(name + " идет");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void voice() {
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
        this.age = age;
    }

    public String getColor() {
        return color;
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
