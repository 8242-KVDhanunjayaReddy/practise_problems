package Exceptions;

public class newthrow {
    public static void main(String[] args) {
       try{
           method1();
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }
    }
     static void method1() throws ArithmeticException, NullPointerException,ClassNotFoundException{
        Class.forName("Demo");

    }
}
