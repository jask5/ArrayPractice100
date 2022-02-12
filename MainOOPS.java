import java.util.*;
import java.lang.*;

//understanding static keyword 

public class MainOOPS {
    static int a = 3;
    static int b;


    //static block ran just once even when I created another object 
    //static block will run when the first obj is created and when class is loaded for the first time
    static {
        System.out.println("Hello");
        b = a * 3;
    }


    public static void main(String[] args) {
        MainOOPS obj = new MainOOPS();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(MainOOPS.a); //since a is a static variable then it can be called using class name with . 
        //
        //System.out.println(Arrays.toString(a));

        MainOOPS.b += 3;
        MainOOPS obj2 = new MainOOPS();
        System.out.println(MainOOPS.a + " " + MainOOPS.b);





    }
}