import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 產生掃描器 (接往 System.in)
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next(); // 拿一行字串
        int myInt = scanner.nextInt(); // 請Scanner自動辨識一個整數並擷取出來
        scanner.close(); // 關閉Scanner

        System.out.println(myString);
        System.out.println(myInt);
    }
}
