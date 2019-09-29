public class Task1_ResultFromCodeFragment {
    public static void main(String[] args) {
        // 1 a)
        int a = 5;
        int b = 10;
        int c = ++ a * b --; // result 60
        System.out.println(c);
        // 1 b)
        System.out.println("1 + 2 =" + 1 + 2); // result 1+2=12
        System.out.println("1 + 2 =" + (1+2)); // result 1+2=3
        // 1 c)
        System.out.println(1 + 2 + "abc"); // result 3abc
        System.out.println("abc" + 1 + 2); // result abc12
        // 1 d)
        int x = 7;
        float y = 5.6f;
        float z = x * y;
        System.out.println(z + " " + (x * y)); // result is 39.2 39.2
    }
}
