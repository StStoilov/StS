public class Task7_PersonCharacteristics {
    public static void main(String[] args) {
        String name = "Georgi";
        String familyName = "Georgiev";
        int birthYear = 2002;
        int currentYear = 2019;
        int age = currentYear - birthYear;
        float weight = 48.3f;
        short height = 156;
        String jobRole = "student";
        System.out.println(name + " " + familyName + " is " + age + " years old. His weight is " + weight + " and he is " + height + " cm tall. He is a " + jobRole + "." );
    }
}
