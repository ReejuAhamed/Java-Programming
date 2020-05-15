import java.util.Scanner;

public class Exp16_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n\nEnter \n1.Light\t2.Fan\t3.Pump\t4.Charge\t5.Exit\n\n");
            System.out.println("Enter your choice:\t");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Light On");
                    break;
                }
                case 2: {
                    System.out.println("Fan on");
                    break;
                }
                case 3: {
                    System.out.println("Pump is on");
                    break;
                }
                case 4: {
                    System.out.println("Charger on");
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.out.println("You choosed a wrong key");
                    break;
                }
            }
        }

    }

}