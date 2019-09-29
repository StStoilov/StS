public class Task5_SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 11;
        int d = 7;
        int temp;
        int temp1;
        // 1st way
        System.out.println(b + " " + a);
        System.out.println(d + " " + c);
        // 2nd way
        System.out.println(+a+" "+ +b); // 5 9
        temp = a;
        a = b;
        b = temp;
        System.out.println(+a+" "+ +b); // 9 5
        System.out.println(+c+" "+ +d); // 11 7
        temp1 = c;
        c=d;
        d = temp1;
        System.out.println(+c+" "+ +d); // 7 11



    }
}
