package com.company;

import java.util.HashMap;

public class Program {
     private Read read = new Read();
     private Calculator calc = new Calculator();
     private LogicalOpp op = new LogicalOpp();
     private HashMap<String, String> users;

    private void initUsers() {
        users= new HashMap<String, String>();
        users.put("administrator", "Ilikemyprogram");
        users.put("Mihai", "picksomething");
        users.put("test","00");
    }

    public boolean loginWithHashMap() {
        initUsers();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your username: ");
            String username = read.getString();
            System.out.print("Enter your password: ");
            String password = read.getString();
            if ((users.containsKey(username))&&(users.get(username).equals(password))){
                System.out.println("\n   Welcome "+username.toUpperCase());
                return true;
            } else {
                System.out.println("Wrong username or password, please try again!");
            }
        }
        return false;
    }

     public void startProgram(){
         boolean repetProgram=executeProgram();
         while(repetProgram) {
              repetProgram=executeProgram();
          }
     }

    private void startMatematical(){
        boolean repetMath;
        do{
            repetMath = executeMatematical();
            op.waitTwo(2);
        } while (repetMath);
    }

     private void startLogical(){
         boolean repetLogical;
         do{
             repetLogical = executeLogicalOpp();
             op.waitTwo(2);
         } while (repetLogical);
     }

     private boolean executeProgram(){
         printMenu();
         int number = read.getInt();
         switch (number){
             case 1:
                 startMatematical();
                 break;
             case 2:
                 startLogical();
                 break;
             case 0:
                 System.out.println("Thanks for using my little program. Bye, bye ! ");
                 return false;
             default:
                 System.out.println("Please enter another value");
         } return true;
     }

     private boolean executeMatematical(){
         printMathematicalOperations();
         int number = read.getInt();
         switch (number){
             case 1:
                 doSum();
                 break;
             case 2:
                 doSubstraction();
                 break;
             case 3:
                 doDivision();
                 break;
             case 4:
                 doMultiply();
                 break;
             case 5:
                 doAverage();
                 break;
             case 6:
                 getRemeinder();
                 break;
             case 7:
                 countXtoY();
                 break;
             case 8:
                 countTo100();
                 break;
             case 9:
                 countToMinus100();
                 break;
             case 10:
                 evenNumbers();
                 break;
             case 11:
                 oddNumbers();
                 break;
             case 12:
                 averageSeven();
                 break;
             case 13:
                 printTwentyNumbersFromFibonacci();
                 break;
             case 14:
                 transFinC();
                 break;
             case 15:
                 transInchToM();
                 break;
             case 16:
                 getHigherNumber();
                 break;
             case 17:
                 getHigherNumber2();
                 break;
             case 0:
                 return false ;
             default:
                 System.out.print("Wrong value");
         } return true;

     }

     private boolean executeLogicalOpp(){
         printLogicalOpp();
         int number = read.getInt();
         switch (number){
             case 1:
                 getHigherNumber();
                 break;
             case 2:
                 checkFastTrackIT();
                 break;
             case 3:
                 isEgualTo4();
                 break;
             case 4:
                 isEven();
                 break;
             case 5:
                 eligibleToVote();
                 break;
             case 6:
                 op.printArray(op.getArrayEven());
                 break;
             case 0:
                 return false;
             default:
                 System.out.println("Please enter another value.");
         } return true;
     }

     private void printMenu(){
         System.out.println("\nChoose a category:\n"+
                 "1.Mathematical operations\n"+
                 "2.Logical operation\n"+
                 "0.EXIT Program\n");
     }

     private void printMathematicalOperations() {
         System.out.println("\nChoose an option:\n"+
                 "1.Sum\n" +
                 "2.Substraction\n" +
                 "3.Division\n" +
                 "4.Multiplication\n" +
                 "5.Average of 3 numbers\n" +
                 "6.Remainder of integer division\n" +
                 "7.Count from x to y\n" +
                 "8.Count from a given number to 100\n"+
                 "9.Count from a given number to -100\n"+
                 "10.Show all even numbers from 1 to 100\n"+
                 "11.Show all odd numbers from 1 to 100\n"+
                 "12.Average numbers divisible by 7 from interval\n"+
                 "13.Show first 20 numbers from  Fibonacci sequence\n"+
                 "14.Transform Fahrenheit to Celsius\n"+
                 "15.Transform Inches to meters\n"+ "" +
                 "16.Get higher number out off 2 numbers\n"+
                 "17.Get higher number out off 3 numbers\n"+
                 "\n"+
                 "0.Return to Main Menu");
     }

    private void printLogicalOpp(){
        System.out.println("\nChoose an option:\n"+
                "1.\n"+
                "2.Check text FastTrackIT\n"+
                "3.Verify if a number is less or greater than 3,and not egual to 4\n" +
                "4.Is number even?\n"+
                "5.Are you eligible to vote?\n"+
                "6.Show all even numbers from 1 to 100 in an Array\n"+
                "\n"+
                "0.Return to Main Menu");
    }

    public boolean simpleLogin() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your username: ");
            String user = read.getString();
            System.out.print("Enter your password: ");
            String password = read.getString();
            if (user.equals("Mihai") && (password.equals("administrator"))) {
                System.out.println("\n\nWelcome Mihai\n");
                return true;
            } else {
                System.out.println("Wrong username or password, please try again!");
            }
        }
        return false;
    }

    private void eligibleToVote(){
         int number = read.getAge();
         System.out.println(op.isEligibleToVote(number));
    }

    private void isEven (){
        int number = read.getInt();
        System.out.println(op.isNumberEven(number));
    }

    private void isEgualTo4 (){
        int number = read.getInt();
        System.out.println(op.verifyNumber(number));
    }
     private void checkFastTrackIT(){
         System.out.println("Enter the text.");
         String str = read.getString();
         System.out.println(op.checkTextFastTrack(str));
     }

    private void getHigherNumber2(){
        System.out.println("Enter tree values.");
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("The greater number is: "+op.biggestNumber(first,second,third));
    }

     private void getHigherNumber(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The greater number is: "+op.getHigherNumber(first,second));
     }

     private void transFinC(){
         int number = read.getInt();
         System.out.println(number+"°F is: "+calc.transFinC(number)+"°C");
     }

     private void transInchToM(){
         double number = read.getInt();
         System.out.println(number+" inches are: "+calc.transfInchM(number)+" meters");
     }

     private void doSum(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The sum is: " + calc.adunare(first,second));
     }

     private void doSubstraction(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The substraction is: " + calc.scadere(first,second));
     }

     private void doDivision(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The division is: " + calc.impartire(first,second));
     }

     private void doMultiply(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The multiply is: " + calc.inmultire(first,second));
     }

     private void doAverage(){
         System.out.println("Enter three values.");
         int first = read.getInt();
         int second = read.getInt();
         int third = read.getInt();
         System.out.println("The average is: " + calc.mediaAtreiNumere(first,second,third));
     }

     private void getRemeinder(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The remeinder of integer division is: "+calc.restulImpartirii(first,second));
     }

     private void countXtoY(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.print("The count from "+first+" to "+second+" is: ");
         calc.countXtoY2(first,second);
     }

     private void countTo100(){
         int number = read.getInt();
         System.out.print("The count from "+number+" to 100 is :");
         calc.countTo100(number);
     }

     private void countToMinus100() {
         int number = read.getInt();
         System.out.print("The count from " + number + " to -100 is :");
         calc.countToMinus100(number);
     }

     private void evenNumbers(){
         System.out.println("All even numbers from 1 to 100 are: ");
         calc.whileEven();
     }

     private void oddNumbers(){
         System.out.println("All odd numbers from 1 to 100 are: ");
         calc.whileOdd();
     }

     private void averageSeven(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The average is : "+calc.whilePrime7(first,second));
     }

     private void printTwentyNumbersFromFibonacci(){
         System.out.println("First 20 numbers from Fibonacci sequence are:");
         calc.fibonacci();
     }


 }

