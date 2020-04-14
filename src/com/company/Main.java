package com.company;

public class Main {

    public static void main(String[] args) {
        // 1)Printam Hello si numele meu

        System.out.println("Hello");
        System.out.println("Mihai");

        System.out.println("......");

        // sau asa :
        String salut = "Hello";
        String nume = "Mihai";

        System.out.println(salut);
        System.out.println(nume);

        // 2)Printam rezultatul sumei a 2 numere

        int x = 5;
        int y = 4;
        int suma = x + y ;
        System.out.println(suma);

        // 3)Printam rezultatul impartirii a 2 numere

        float t = 10;
        float z = 3;
        double rezultatulImpartirii = t/z;
        System.out.println(rezultatulImpartirii);

        // 4) Rezultatul operatiunilor :
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);
        // b. (55+9) % 9 {Adica restul impartirii nr. 64 la 9 }
        int a=55;
        int b=9;
        int ecuatia = (a+b)%9;
        System.out.println(ecuatia);
        //c. 20 + -3*5 / 8
        int u=-3;
        int r=5;
        double inmultirea1=u*r;
        double impartirea=inmultirea1/8;
        double adunarea1=20+impartirea;
        System.out.println(adunarea1);
        //d. 5 + 15 / 3 * 2 - 8 % 3
        int d=5+15/3*2-8%3;
        System.out.println(d);








    }
}
