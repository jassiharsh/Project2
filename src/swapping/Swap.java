package swapping;

public class Swap {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int temp;

        System.out.println("a =" + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a ="+a);
        System.out.println("b ="+b);


    }
}