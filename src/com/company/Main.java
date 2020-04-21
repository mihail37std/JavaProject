package com.company;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

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


        System.out.println("     ");
        System.out.println(" * Tema lab 2 * ");
        System.out.println("     ");

        /* 1) Pentru exercitiile din clasa main() de data trecuta, creati metode separate
             pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().
         */
            Hello();
            Numele();
            sum();
            scaderea();
            impartirea();
            inmultirea();
            ex4a();
            ex4b();
            ex4c();
            ex4d();

            /* 2) Scrieti care o metoda java pentru fiecare din urmatoarele operatii
            matematice: adunare, scadere, inmultire, impartire.
             */

            System.out.println("Rezultatul adunarii este: " + adunare(2,3));
            System.out.println("Rezultatul scaderii este: "+ scadere(10,8));
            System.out.println("Rezultatul inmultirii este: "+ inmultire(6,5));
            System.out.println("Rezultatul impartirii este: "+impartire(27,3));

        // 3. Scrieti o metoda java, care sa afiseze urmatorul model:

            System.out.println("       ");
            System.out.println("       ");
            System.out.println("     J     a    V      V    a");
            System.out.println("     J    a a    V    V    a a");
            System.out.println(" J   J   aaaaa    V  V    aaaaa");
            System.out.println("  JJ   a      a    V    a      a");
            System.out.println("       ");
            System.out.println("       ");

         // 4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

        System.out.println("Media numerelor este: "+media(3,20,4));

        //5.Scrieti o metoda java, care sa afiseze urmatorul model:
        myRobot();



        // 6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere

        System.out.println("Restul impartirii numerelor este "+restulImpartirii(10,3));

        /*7.Scrieti o metoda java, care sa primeasca ca si parametru un numar,
        care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
         */

        System.out.println("transformarea din F in grade C este: "+transFinC(32));

        /* 8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
        care sa reprezinte distanta in inch, si sa returneze distanta in metrii
         */

        System.out.println("Transformarea din INCh in m este: "+transfInchM(-49.56)+" m ");

        /*9. Scrieti o metoda java, care primeste distanta (in metrii) si timpul
        (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii
        pe secunda, kilometrii pe ora si mile pe ora.
        (Indiciu: 1 mila = 1609 metrii)
         */









        }

        public static void Hello() {
            System.out.println(" Hello ");
        }

        public static void Numele() {
            System.out.println(" Mihail ");
        }


        public static void sum() {
            int sum = 4 + 5;
            System.out.println(sum);

        }

        public static void scaderea() {
            int minus = 4 - 5;
            System.out.println(minus);
        }

        public static void impartirea() {
            double x = 10;
            double y = 3;
            double imp = x/y;
            System.out.println(imp);
        }

        public static void inmultirea(){
            int imp = 10*3;
            System.out.println(imp);
        }

        public static void ex4a (){
        int a = -5 + 8 * 6;
            System.out.println(a);
        }

        public static void ex4b (){
        int b=(55+9) % 9;
            System.out.println(b);
        }

        public static void ex4c(){
            int u=-3;
            int r=5;
            double inmultirea1=u*r;
            double impartirea=inmultirea1/8;
            double adunarea1=20+impartirea;
            System.out.println(adunarea1);
        }

        public static void ex4d(){
            int d=5+15/3*2-8%3;
            System.out.println(d);
        }

        public static int adunare(int primulNumar, int alDoileaNumar){
             int rezultat = primulNumar + alDoileaNumar;
             return rezultat;
        }

        public static int scadere(int primulNumar, int alDoileaNumar){
             int rezultat = primulNumar - alDoileaNumar;
             return rezultat;
        }

        public static int inmultire (int primulNumar, int alDoileaNumar){
             int rezultat = primulNumar * alDoileaNumar;
             return rezultat;
        }

        public static float impartire (int primulNumar, int alDoileaNumar) {
            float rezultat = primulNumar / alDoileaNumar;
            return rezultat;
        }

        public static int media (int x, int y, int k){
           int rezultat = (x+y+k)/3;
           return rezultat;
        }

        public static int restulImpartirii (int x, int y){
         int restImp = x%y;
         return restImp;
        }

        public static double transFinC (int x){
         double gradeC=(x-32)*5.0/9;
         return gradeC;
        }

        public static double transfInchM (double x){
          double distMetri = x/39.370;
          return distMetri;
        }

        public static void myRobot (){
          String robotel="   +\" \" \" \" \"+\n" +
                         "  [|  o   o  |]\n"+
                         "   |    ^    |\n"+
                         "   |   '_'   |\n"+
                         "   +_ _ _ _ _+";
            System.out.println(robotel);

        }










    }








