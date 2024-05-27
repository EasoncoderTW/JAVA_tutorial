package Lesson4.Practice1;

// main class (has main function in it)
public class Practice1 {
    public static void main(String[] args) {
        Robot r = new Robot(10, "Eason"); // 產生物件
        r.say_hello();
        r.set_id(-5);
        r.say_hello();
        int x = r.get_id();
        System.out.println("拿到id = " + x);
    }
}

class Robot {
    private int id; // 隱藏變數(封裝)
    String name;

    /* Constructor 建構式 - 物件產生當下要做的事 */
    // 例外: 建構是沒有型態
    public Robot(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Robot 物件被建立了");
    }

    public void say_hello() {
        System.out.println("Hello, my name is " + name + " [id] " + id);
    }

    /* setter (設定隱藏變數用method) */
    public void set_id(int d) {
        if (d >= 0) {
            this.id = d;
        } else {
            System.out.println("ID 設定失敗");
        }
    }

    /* getter (讀取隱藏變數用的method) */
    public int get_id() {
        return this.id;
    }

}
