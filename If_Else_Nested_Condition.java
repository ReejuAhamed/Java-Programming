import java.util.Scanner;

public class If_Else_Nested_Condition {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:\t");
        age = sc.nextInt();

        if (age < 18) {
            if (age <= 5) {
                System.out.println("You are child");
            } else {
                System.out.println("You are young");
            }
            System.out.println("You are not adult");
        } else if (age < 60) {
            if (age < 40) {
                System.out.println("Yor are adult");
            } else {
                System.out.println("You r going to be a buddha");
            }

        } else {
            if (age < 80) {
                System.out.println("You are old");
            } else {
                System.out.println("You are going to die");
            }
        }

        System.out.println("Because Your age is :" + age);
    }

}