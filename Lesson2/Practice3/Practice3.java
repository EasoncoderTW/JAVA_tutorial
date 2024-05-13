package Lesson2.Practice3;

public class Practice3 {
    public static void main(String[] args) {
        int r = power(2, 5);
        System.out.println(r);

        tell("Eason", "Turn on the Light");
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void tell(String name, String do_something) {
        System.out.print(name);
        System.out.print(",");
        System.out.println(do_something);
    }

}
