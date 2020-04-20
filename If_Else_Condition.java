import java.util.Scanner;

public class If_Else_Condition {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\t");
        age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not adult");
        } else {
            System.out.println("Yor are adult");
        }

        System.out.println("Your age is :" + age);
    }

}