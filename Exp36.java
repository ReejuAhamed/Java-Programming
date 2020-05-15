import java.util.Scanner;
class Exp36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1=0,n2=1,n3,n;
        System.out.println("Enter the number of term you want to see:-");
        n = sc.nextLong();
        System.out.print(n1+" "+n2);
        for (int i=2;i<n;i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}