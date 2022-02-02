import java.util.*;
import java.lang.*;
import java.io.*;


//using StringBuilder class
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //taking string input from users
        String input = sc.nextLine();

        StringBuilder input1 = new StringBuilder(); //making object of StringBuilder class to use various methods
        input1.append(input); //appending user input 
        input1.reverse(); //reversing the string 

        System.out.println("Reversed String is: " + input1);

        /* another way using Strings
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String nstr = "";
        char ch;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println(nstr);



        
        
        
        
        */

    }
    
}
