package com.company;

import java.util.*;

public class Read {



    //Ex1:
    public int getInt (){
        boolean test = true;
        int myInt = 0 ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number: ");
                myInt = scan.nextInt();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myInt;
    }

    public int getAge (){
        boolean test = true;
        byte age = 0 ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter you're age: ");
                age = scan.nextByte();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return age;
    }

    //Ex2:
    public double getDouble (){
        boolean test = true;
        double myDouble = 0.0 ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a decimal number: ");
                myDouble = scan.nextDouble();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myDouble;
    }

    public float getFloat (){
        boolean test = true;
        float myFloat = 0F ;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a float number: ");
                myFloat = scan.nextFloat();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myFloat;
    }

    public long getLong (){
        boolean test = true;
        long myLong = 0L;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a long number : ");
                myLong = scan.nextLong();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myLong;
    }

    public byte getByte (){
        boolean test = true;
        byte myByte = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a small number (byte) : ");
                myByte = scan.nextByte();
                test = false;
            } catch (InputMismatchException e){
                System.out.println("Incorrect value entered. Please try again ");
            }
        } while (test);
        return myByte;
    }

    public String getString(){
        Scanner scanner= new Scanner(System.in);
        return scanner.next();
    }

    //Ex3:
    public int[] returnArrayWithInputNumbers (int indexOfArray){
        int[] array = new int[indexOfArray];
        for (int i = 0; i < array.length; i++) {
            boolean test = true;
            do {
                try {

                    System.out.println("Please enter the " + (i + 1) + " number of the array: ");
                    Scanner scan = new Scanner(System.in);
                    array[i] = scan.nextInt();
                    test = false;

                } catch (InputMismatchException e) {
                    System.out.println("Incorrect value entered. Please try again ");
                }
            } while (test);
        }
        System.out.print("The array is : ");
       for(int i:array){
               System.out.print(i+" ");
           }
           return array;


    }

    //Ex4:
     public List<Integer> getList(){
        List<Integer> lista = new ArrayList<Integer>();
        boolean stop = true ;
        int x = 0 ;
        do {
            try {
                System.out.print("Introduceti numarul dorit : ");
                Scanner scan = new Scanner(System.in);
                x = scan.nextInt();
                lista.add(x);
            } catch (InputMismatchException e){
                stop = false ;
                System.out.println("Lista dvs este "+lista);
            }
        } while ((x> Integer.MIN_VALUE) && (x<Integer.MAX_VALUE) && stop);

        return lista;
    }






}
