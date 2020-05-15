import java.util.Scanner;
class Exp37{
    public static void main(String[] args) {
        int num,temp=0,limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        limit=sc.nextInt();
        for(num=1;num<=limit;num++){
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