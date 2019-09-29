public class Task2_LeapYear {
    public static void main(String[] args) {
        int year = 2016;
        System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 !=0);    // true
        int year1 = 1992;
        System.out.println(year1 % 400 == 0 || year1 % 4 == 0 && year1 % 100 !=0); // true
        int year2 = 2001;
        System.out.println(year2 % 400 == 0 || year2 % 4 == 0 && year2 % 100 !=0); // false
        int year3 = 1900;
        System.out.println(year3 % 400 == 0 || year3 % 4 == 0 && year3 % 100 !=0); // false
        int year4 = 2400;
        System.out.println(year4 % 400 == 0 || year4 % 4 == 0 && year4 % 100 !=0); // true
    }
}
