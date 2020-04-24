package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeMain {
    public static void main(String[] args) {
       // String nume = "Hello";
       // front3("Mihail");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 numbers u want: ");
        int myInt = scan.nextInt();
        int myInt1= scan.nextInt();
        System.out.println("The sum is: "+sum(myInt,myInt1));





        //System.out.println(front3("omgFG"));
        //System.out.println(backAll(""));


        //String a = nume.substring(2, 5);
        //System.out.println(a);
        //System.out.println("Lungimea sirului de caractere este: " + nume.length());

    }

        public static String front3 (String nume ){
            String front ;

            if (nume.length() >= 3) {
                front = nume.substring(0, 3);
            }
            else {
                front = nume ;}
            return front+front+front;



        }

        public static String backAll (String nume){
           String back1 ;

           if (nume.length() >=1) {
               back1 = nume.substring(nume.length()-1,nume.length())+nume+nume.substring(nume.length()-1,nume.length());
           }
           else {
               back1 = "Stringul dvs are mai putin de 1 caracter";
           }
           return back1;


        }

        public static int sum (int myInt, int myInt1){
           int suma = myInt+myInt1;
           return suma;
        }








}
