public class Practice1 {
    public static void main(String[] args) {
        float a; // 宣告
        a = 3.1415926f;
        System.out.println(a);

        double b; // 宣告
        b = 3.1415926;
        System.out.println(b);

        int c = 10;
        int d = 20;
        int e = c + d;
        System.out.println(e);

        // int <- int + float
        // int x = 10 + 2.3f;
        // int <- float + float
        // int x = 15.3f + 12.3f;
        // float <- int + float
        float x = 15 + 12.3f;
        System.out.println(x);
        // float <- float + float
        float y = 15.3f + 12.3f;
        System.out.println(y);
    }
}
