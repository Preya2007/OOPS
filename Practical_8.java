public class Practical_8 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please run the program like this:");
            System.out.println("java Practical_8 10 20");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}

