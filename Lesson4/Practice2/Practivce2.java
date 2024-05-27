package Lesson4.Practice2;

import java.util.ArrayList;

public class Practivce2 {
    public static void main(String[] args) {
        AccountingBook book = new AccountingBook("2024五月");
        book.add("早餐", 50);
        book.add("午餐", 100);
        book.add("飲料", 45);
        System.out.println(book.toString());
    }
}

/* 小 class 專門記錄單一帳務 */
class AccountingData {
    String itemString;
    int amount;

    public String toString() {
        return String.format("[%-20s] %d", itemString, amount);
    }
}

class AccountingBook {
    String name;
    ArrayList<AccountingData> array;

    public AccountingBook(String name) {
        this.name = name;
        System.out.println("記帳本[" + name + "]已建立");
        array = new ArrayList<AccountingData>(); // 建立ArrayList
    }

    public void add(String itemname, int amount) {
        AccountingData d = new AccountingData(); // 產生小物件
        d.amount = amount;
        d.itemString = itemname;
        array.add(d); // 加入 arraylist
    }

    public String toString() {
        String s = "======== 記帳本 [" + this.name + "]========\n";
        for (AccountingData a : array) {
            s += a.toString();
            s += "\n";
        }
        return s;
    }

}