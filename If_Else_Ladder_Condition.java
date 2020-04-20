import java.util.Scanner;

public class If_Else_Ladder_Condition {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\t");
        age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not adult");
        } else if (age < 60) {
            System.out.println("Yor are adult");
        } else {
            System.out.println("You are old");
        }

        System.out.println("Your age is :" + age);
    }

}