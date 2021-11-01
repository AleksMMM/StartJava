public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 19;
        if (age > 20) {
            System.out.println("возраст" + age);
        }

        boolean sex = true;
        if (sex) {
            System.out.println("man");
        }

        if (!(sex)) {
            System.out.println("woman");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println(height);
        } else {
            System.out.println(height);
        }

        char firstChar = 'M';
        if (firstChar == 'M') {
            System.out.println(firstChar);
        } else if(firstChar == 'I') {
            System.out.println("first I");
        } else {
            System.out.println("no");
        }
    }
}
