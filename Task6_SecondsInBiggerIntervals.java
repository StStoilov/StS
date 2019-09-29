public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        //int digit = 129600;
        //int digit = 3600;
        int digit = 1234567;
        int sec = 1;
        int min = 60*sec;
        int hour = 60*min;
        int day = 24*hour;
        int d = digit / day;
        int h = (digit % day)/hour;
        int m = ((digit % day) % hour)/min;
        int s = (((digit % day) % hour)%min)/sec;
        //System.out.println(day);
        //System.out.println(d);
        //System.out.println(h);
        //System.out.println(m);
        //System.out.println(s);
        System.out.println(d +" days" + "," + h +" hours" + "," + m + " minutes" + ","+ s + " seconds"); // result: 14 days,6 hours,56 minutes,7 seconds
    }
}
