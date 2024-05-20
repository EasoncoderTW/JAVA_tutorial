import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        // array 陣列
        int[] a = new int[10]; // a 目前只是一個"空殼"，並將"空殼"建立出 10 個空間
        a[0] = 10;
        a[1] = 12;

        /*
         * for (int i : a) {
         * System.out.println(i);
         * }
         */

        // sort
        int[] b = { 2, 4, 1, 3, 5 }; // 直接給予數值
        Arrays.sort(b); // 利用 sort 排序
        System.out.println(Arrays.toString(b)); // 利用 Arrays 協助輸出排版
    }
}
