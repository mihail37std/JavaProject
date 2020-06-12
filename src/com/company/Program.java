package com.company;

 public class Program {
     private Read read = new Read();
     private Calculator calc = new Calculator();
     private LogicalOpp op = new LogicalOpp();

     public void startProgram(){
         boolean repetProgram;
         do{
             repetProgram = executeProgram();
         } while (repetProgram);
     }

     private boolean executeProgram2(){
         printMenu2();
         int number = read.getInt();
         switch (number){
             case 1:
                 executeProgram();
                 break;
             case 2:
                 executeLogicalOpp();
                 break;
             case 0:
                 System.out.println("Thanks for using my little program. Bye, bye ! ");
                 return false;
         } return true;
     }

     private boolean executeLogicalOpp(){
         return false;
     }

     private boolean executeProgram(){
         printMenu();
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
             case 0:
                 printMenu2();
                 return false;
             default:
                     printMenu();
         } return true;

     }

     private void printMenu2(){
         System.out.println("\nChoose a category:\n"+
                 "1.Mathematical operations\n"+
                 "2.Logical operation\n"+
                 "0.EXIT Program\n");
     }

     private void printMenu() {
         System.out.println("\nChoose an option:\n"+
                 "1.Sum\n" +
                 "2.Substraction\n" +
                 "3.Division\n" +
                 "4.Multiply\n" +
                 "5.Average of 3 numbers\n" +
                 "6.Remainder of integer division\n" +
                 "7.Count from x to y\n" +
                 "8.Count from a given number to 100\n"+
                 "9.Count from a given number to -100\n"+
                 "10.Print all even numbers from 1 to 100\n"+
                 "11.Print all odd numbers from 1 to 100\n"+
                 "12.\n"+
                 "\n"+
                 "0.Exit");
     }

     private void doSum(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The sum is: " + calc.adunare(first,second));
         op.waitTwo(1);
     }

     private void doSubstraction(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The substraction is: " + calc.scadere(first,second));
         op.waitTwo(1);
     }

     private void doDivision(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The division is: " + calc.impartire(first,second));
         op.waitTwo(1);
     }

     private void doMultiply(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The multiply is: " + calc.inmultire(first,second));
         op.waitTwo(1);
     }

     private void doAverage(){
         System.out.println("Enter three values.");
         int first = read.getInt();
         int second = read.getInt();
         int third = read.getInt();
         System.out.println("The average is: " + calc.mediaAtreiNumere(first,second,third));
         op.waitTwo(1);
     }

     private void getRemeinder(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.println("The remeinder of integer division is: "+calc.restulImpartirii(first,second));
         op.waitTwo(1);
     }

     private void countXtoY(){
         System.out.println("Enter two values.");
         int first = read.getInt();
         int second = read.getInt();
         System.out.print("The count from "+first+" to "+second+" is: ");
         calc.countXtoY2(first,second);
         op.waitTwo(1);
     }

     private void countTo100(){
         int number = read.getInt();
         System.out.print("The count from "+number+" to 100 is :");
         calc.countTo100(number);
         op.waitTwo(1);
     }

     private void countToMinus100() {
         int number = read.getInt();
         System.out.print("The count from " + number + " to -100 is :");
         calc.countToMinus100(number);
         op.waitTwo(1);
     }

     private void evenNumbers(){
         System.out.println("All even numbers from 1 to 100 are: ");
         calc.whileEven();
         op.waitTwo(1);
     }

     private void oddNumbers(){
         System.out.println("All odd numbers from 1 to 100 are: ");
         calc.whileOdd();
         op.waitTwo(1);
     }


 }

