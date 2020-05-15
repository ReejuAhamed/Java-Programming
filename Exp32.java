import java.util.Scanner;
class Exp32{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        lbl1:
        for(i=1;i<=n;i++){
            lbl2:
            for(j=1;j<=n;j++)
            {
                if(i==5 && j==5){
                    break lbl1;
                }
                else{
                    System.out.print(j+ "  ");
                }
            }
            System.out.println();
        }
    }
}