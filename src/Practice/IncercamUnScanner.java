package Practice;


import java.util.Scanner;

public class IncercamUnScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integerNumber = 0 ;
        double doubleNumber = 0 ;

        System.out.println("Enter any integer: ");
        if(scanner.hasNextInt()==true) {
            integerNumber=scanner.nextInt();
        }
        System.out.println("You entered the int: "+integerNumber);

        System.out.println("Enter any decimal number: ");
        if(scanner.hasNextDouble()==true){
            doubleNumber=scanner.nextDouble();
        }
        System.out.println("You entered the double: " + doubleNumber);













    }

}


