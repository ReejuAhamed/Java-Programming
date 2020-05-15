import java.util.Scanner;
class Exp38{
    public static void main(String[] args) {
        int num,temp=0,up,lo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        lo=sc.nextInt();
        System.out.println("Enter upper limit:");
        up=sc.nextInt();

        for(num=lo;num<=up;num++){
            temp=0;
            if(num<=0 || num==1){
                temp++;
            }
            else{
                for(int i=2;i<=num/2;i++)
                {
                
                    if(num%i==0){
                        temp++;
                        break;
                    }
                }

                if(temp!=0){
                 continue;
                }
                else{
                    System.out.println(num);
                }
            }
            
        }
    }
}