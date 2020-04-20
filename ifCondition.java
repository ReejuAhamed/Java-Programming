import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\t");
        age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not adult");
        }
    }

}