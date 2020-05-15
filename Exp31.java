import java.util.Scanner;
class Exp31{
    public static void main(String[] args) {
        int arr[]={1,5,7,3,4,9,10,14,15,20};
        System.out.println("Using Normal For Loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Using Each For Loop");
        for(int i:arr){
            System.out.println(i);
        }
        
    }
}