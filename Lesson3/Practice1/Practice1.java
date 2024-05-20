public class Practice1 {
    public static void main(String[] args) {
        String s = "My name is Eason";
        System.out.println("string: " + s);
        System.out.println("lens: " + s.length()); // 字串長度
        String[] a = s.split(" "); // 以regex的內容作為字串分割依據
        for (String c : a) {
            System.out.println("split: " + c);
        }

        String s2 = "  123  456 ";
        System.out.println(s2.trim()); // 移除前後空白
        System.out.println(s2.replace(" ", "@"));
        System.out.println(s2.replaceAll(" ", "#"));

        /*
         * 1.scanner 讀取字串: "名稱 電話 email"
         * 2.將字串split
         * 3.個別顯示出來(前面加上名稱...等 prefix)
         */
    }
}
