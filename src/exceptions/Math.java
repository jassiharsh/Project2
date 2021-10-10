package exceptions;

public class Math {
    public static void main(String[] args) {
        int a = 6;

        try{
            System.out.println(a/0);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("your code has issue");
        }
        System.out.println("Line 3");

    }
}
