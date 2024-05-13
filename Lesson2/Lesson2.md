# JAVA Lesson 2
##  1. 流程控制 - if/else
- 條件
    - 判斷式 or 布林值(true/false)
    - 關係運算: 等於(==)、不等於(!=)、大於(>)、小於(>)、大於等於(>=)、小於等於(<=)
```
    if(條件) {
        成立要執行的程式區塊;
    } else {
        不成立的後要執行的區塊;
    }
```
- 範例詳見 `Practice1`
- 小試身手
    - `輸入`為`兩個數字` (Scanner / 變數)
    - `比較`兩者大小 (if/else)
    - `輸出`大減小的值(相差的絕對值) (println)

## 2. 流程控制 - loop
- for loop
    - 語法 for(`初始動作`;`迴圈條件`;`迭代動作`){`迴圈體`}
    - example `Practice2`
    ```
    package Lesson2.Practice2;

    public class Practice2 {
        public static void main(String[] args) {
            for (int i = 3; i > 0; i--) {
                System.out.println("" + i + "," + j); // str + int -> str
            }
        }
    }
    ```

- while loop
    - 語法 while(`迴圈條件`){`迴圈體`}

## Method 方法
**定義方法就像在製造機器一樣，你需要自行決定這個機器需要什麼參數?以及會不會產出資料?有或者這個機器會幫忙做什麼任務?如何實現?**
- 方法的宣告(Definition)
    - **以開發者的角度去設計函示內部的運作**
    - 方法型態: 又稱回傳值型態，可以是任意型態，如果不想要回傳值則用`void`
    - `return 回傳變數` 當方法型態為`void`時可省略
    ```
    public static 方法型態 方法名稱(參數型態 參數1, 參數型態 參數2, ...)
    {
        方法區塊(想執行的目的)

        [return 回傳變數;]
    }
    ```
    - `public` 公開 `static` 靜態
- 方法的使用
    - **以使用者的角度去利用設計好的方法**
    ```
    回傳值型態 回傳變數;
    回傳變數 = 方法名稱(變數1, 變數2, ...);
    ```
- example `Practice3`
```
package Lesson2.Practice3;

public class Practice3 {
    public static void main(String[] args) {
        int r = power(2, 5);
        System.out.println(r);
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
```
- 小試身手
    - `輸入`為`3組數字`,一組數字為`座標 x,y` (皆為整數) 
    - `計算`三個座標之間兩兩的距離 (計算功能用Method包裝起來)
    - `比較`三個距離之間，取最小值
    - `輸出`最小值 (println)
