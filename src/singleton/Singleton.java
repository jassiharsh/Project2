package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton(); // twe have create single objectt

        private Singleton(){

        }
    public static Singleton getInstance(){
            return singleton;
    }
    public void doWork(){
        System.out.println("do my work");
    }




}
