# JAVA Lesson 1
1. 下載JAVA SDK (JDK)
    - [JDK 17.0.7](https://download.oracle.com/java/17/archive/jdk-17.0.7_windows-x64_bin.exe)
2. Vscode 安裝套件

3. JAVA 程式建構
    - 3.1 建立資料夾
    - 3.2 建立mian class (名稱要跟檔名一樣)
    - 3.3 建立主程式
    - 3.4 執行
        ```bash
        java *.java  // 直接執行      
        ```
        ```bash
        javac *.java // 先編譯
        java *       // 再執行      
        ```
4. 輸入輸出
    - 第一支程式 - HelloWorld
    - 輸出
    ```java=
        public class Helloworld {
            public static void main(String[] args) {
                // 輸出
                System.out.println("Hello World");
            }
        }
    ```

5. 型態(Type) - Practice 1
    - 整數
        - byte / char (8 bit, 0~255, -127~128)
        - short (16 bit)
        - int (32 bit)
        - long (64 bit)
    - 浮點數
        - float (32 bit)
            ```java=
                float f = 1.5f; // 加上f表示float
            ```
        - double (64 bit, 預設)
            ```java=
                double d = 1.5; // 預設為double
            ```

