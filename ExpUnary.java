
public class ExpUnary {
    static public void main(String... args) {
        int a = 5, b = 8;
        int c = a++ + b; /// a = 5, b = 8, (a++ +b) = 13, a=6 b=8
        int d = a++ + b++; /// a = 6,b = 8, (a++ + b++)=14, a = 7, b = 9
        int e = a++ + ++b; /// a =7 , b =10 , (a++ + ++b)=17, a = 8, b = 10
        int f = ++a + b; /// a = 9, b = 10 , (++a + b)=19, a= 9,b=10
        int g = ++a + b++; /// a = 10 , b =10 , (++a + b++)=20, a= 10, b=11
        int h = ++a + ++b; /// a=11,b=12 , (++a + ++b)= 23, a=11, b=12

        System.out.println("c = " + c);
        System.out.println("d =" + d);
        System.out.println("e =" + e);
        System.out.println("f =" + f);
        System.out.println("g =" + g);
        System.out.println("h =" + h);
        System.out.println("a = " + a + "     b =" + b);

    }

}