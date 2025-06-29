//Take user's name and birth year,and print the current age

import java.util.Scanner;
import java.util.Calendar;
import java.time.Year;
public class Age {
    //String name;
    //int birthyear;

     
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter your Birth Year:");
        int birthyear = sc.nextInt();

        Calender calender = Calender.getInstance();
        int currentyear = Calender.getInstance().get(Calender.year);

        int age = currentyear - birthyear;
        
        
        System.out.println("\nHello"+" "+name +" "+"!");
        System.out.println("\nYou are"+" "+age+" "+"years old");

        sc.close();
    }
}
