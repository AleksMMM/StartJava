public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 19;
        int sex = 1;
        double height = 1.90;
        char first = 'M';
        if (age > 20) {
            System.out.println("возраст" + age);
        }
        if (sex == 1) {
            System.out.println("man");
        }

        if (!(sex == 1)) {
            System.out.println("woman");
        }

        if (height < 1.80) {
            System.out.println(height);
        } else {
            System.out.println(height);
        }

        if (first == 'M') {
            System.out.println(first);
        } else if(first == 'I') {
            System.out.println("first I");
        }else {
            System.out.println("no");
        }
    }
}
