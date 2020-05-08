package com.company;

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
        int suma = x + y;
        System.out.println(suma);

        // 3)Printam rezultatul impartirii a 2 numere

        float t = 10;
        float z = 3;
        double rezultatulImpartirii = t / z;
        System.out.println(rezultatulImpartirii);

        // 4) Rezultatul operatiunilor :
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);
        // b. (55+9) % 9 {Adica restul impartirii nr. 64 la 9 }
        int a = 55;
        int b = 9;
        int ecuatia = (a + b) % 9;
        System.out.println(ecuatia);
        //c. 20 + -3*5 / 8
        int u = -3;
        int r = 5;
        double inmultirea1 = u * r;
        double impartirea = inmultirea1 / 8;
        double adunarea1 = 20 + impartirea;
        System.out.println(adunarea1);
        //d. 5 + 15 / 3 * 2 - 8 % 3
        int d = 5 + 15 / 3 * 2 - 8 % 3;
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

        Calculator calc = new Calculator();

        System.out.println("Rezultatul adunarii este: " + calc.adunare(15, 25));
        System.out.println("Rezultatul scaderii este: " + calc.scadere(10, 8));
        System.out.println("Rezultatul inmultirii este: " + calc.inmultire(6, 5));
        System.out.println("Rezultatul impartirii este: " + calc.impartire(27, 5));

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

        System.out.println("Media numerelor este: " + calc.mediaAtreiNumere(3, 9, 5));

        //5.Scrieti o metoda java, care sa afiseze urmatorul model:
        myRobot();


        // 6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere

        System.out.println("Restul impartirii numerelor este " + calc.restulImpartirii(10, 3));

        /*7.Scrieti o metoda java, care sa primeasca ca si parametru un numar,
        care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
         */

        System.out.println("transformarea din F in grade C este: " + transFinC(32));

        /* 8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
        care sa reprezinte distanta in inch, si sa returneze distanta in metrii
         */

        System.out.println("Transformarea din INCh in m este: " + transfInchM(-49.56) + " m " + "\n");

        /*9. Scrieti o metoda java, care primeste distanta (in metrii) si timpul
        (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii
        pe secunda, kilometrii pe ora si mile pe ora.
        (Indiciu: 1 mila = 1609 metrii)
         */


        System.out.println("TEMA LAB 3\n");

        /*3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
        si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode
        care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
         */

        LogicalOpp op = new LogicalOpp();

        int biggest = op.getHigherNumber(2, 3);

        System.out.println("The bigger number is: " + biggest);

        /*4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
        // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
        // Daca da, atunci metoda sa returneze “Learning text comparison”.
        Daca nu, atunci metoda sa returneze “Got to try some more”.*/

        String checkStr = op.checkTextFastTrack("FastTrackIT");
        System.out.println(checkStr);

        /*5. Creati o metoda de tip String, care sa primeasca un parametru de tip String,
         si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”,
         si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul,
         in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
         returnati numarul si textul, in ordinea asta. */

        String checkStNr = op.checkTextAndNumber("FastTrack", 5);
        System.out.println(checkStNr);

        /* 6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
        Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
        “The amount of snow this winter was(cm): “ si numarul.
        Daca nu, sa printeze “The forecast snow is(cm):” si numarul. */

        System.out.println(op.checkSnow(8));

        /* 7.Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
        Daca numarul este egal cu 4, returnati “The number is equal to 4”,
        iar daca numarul este mai mic de 3 returnati “The number is lower than 3” */

        System.out.println(op.verifyNumber(1));

        /* 8.Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
         Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
         unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se
         foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
         ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case  */

        op.printNumber(10);


        /*9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
         si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.*/

        System.out.println(op.isNumberEven(362));

        /*10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
        care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
        Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.  */

        System.out.println(op.isEligibleToVote(18));

        //11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.

        System.out.println("Cel mai mare numar este: "+op.biggestNumber(489,410,410));


        System.out.println("------------------------------------------------\n");

        // TEMA LAB 4

        System.out.println("Java For Loops \n");

        /*1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
       Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
        pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
        deoarece metoda afiseaza, nu returneaza.  */

        System.out.println("Ex 1: \n");
        op.printPrintForLoop(97);
        System.out.println("Ex 2: \n");

        /* 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
         Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
          pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
          deoarece metoda afiseaza, nu returneaza    */

        op.printPrintForLoop2(-89);
        System.out.println("Ex 3: \n");

        /*3.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        pana la cel de-al doilea
        (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y. */

        op.printTwoParameters(4,9);
        System.out.println("Ex 4: \n");

        /*4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
         Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare
         crescatoare de la cel mai mic la cel mai mare. (ex: daca int x e primul parametru iar int y  este
         cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x) */

        op.printTwoParameters2(5,2);
        System.out.println("Ex 5: \n");

        //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

        op.printEven();
        System.out.println("Ex 6: \n");


        //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

        op.printOdd();
        System.out.println("Ex 7: \n");


        /*7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
         Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
         iar la final sa returneze rezultatul.   */

        op.addForNumbers(90);
        System.out.println("Ex 8: \n");

        /*8.Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
         Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
         si sa calculeze media numerelor. La final, metoda sa returneze media */

        System.out.println(op.addForNumbers2(95)+"\n");
        System.out.println("Ex 9: \n");


        //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

        op.theStarsSchemee();

        System.out.println("Java While Loop\n");
        System.out.println("Ex 1: \n");

        /* 1. Creati o metoda in clasa Calculator, care sa primeste un numar ca si parametru.
        Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
        pornind de la numarul primit ca si parametru.*/

        calc.countTo100(50);
        System.out.println("Ex 2: \n");

        /* 2. Creati o metoda in clasa Calculator, care sa primeste un numar ca si parametru.
         Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
         pornind de la numarul primit ca si parametru.*/

        calc.countToMinus100(-80);
        System.out.println("Ex 3: \n");

        /* 3.Creati o metoda in clasa Calculator, care sa primeste doi parametrii de tip numar.
         Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
         pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
         numaratoarea sa se faca de la x, la y. */

        calc.countXToY(2,9);
        System.out.println("Ex 4: \n");

        /* 4. Creati o metoda in clasa Calculator, care sa primeste doi parametrii de tip numar.
         Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
         de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
         daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).   */

        calc.countXtoY2(5,2);
        System.out.println("Ex 5: \n");

        // 5.Creati o metoda in clasa Calculator care sa afiseze toate numerele pare de la 1 la 100.

        calc.whileEven();
        System.out.println("Ex 6: \n");

        //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

        calc.whileOdd();
        System.out.println("Ex 7: \n");

        /* 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
         iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count
         in metoda, pentru a numara toate numerele din interval. */

        calc.whileSum111And8899();
        System.out.println("Ex 8: \n");

        /* 8.Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor
        divizibile cu 7, din acel interval*/

        System.out.println(calc.whilePrime7(1,21)+"\n");
        System.out.println("Ex 9: \n");

        // 9.Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

        calc.fibonacci();
        System.out.println("Ex 10: \n");


        /* 10. Creati o metoda numita CozaLozaWoza
        Metoda va afisa:
        - numerele de la 1 la 11
        - 11 numere pe linie
        - se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
        - se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
        - se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
        - se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
        - se va afisa CozaWoza pentru multiplu de 3 SI 7
        - se va afisa WozaLoza pentru multiplu de 5 SI 7
        - se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7 */

        calc.cozaLozaWoza();


























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
        double imp = x / y;
        System.out.println(imp);
    }

    public static void inmultirea() {
        int imp = 10 * 3;
        System.out.println(imp);
    }

    public static void ex4a() {
        int a = -5 + 8 * 6;
        System.out.println(a);
    }

    public static void ex4b() {
        int b = (55 + 9) % 9;
        System.out.println(b);
    }

    public static void ex4c() {
        int u = -3;
        int r = 5;
        double inmultirea1 = u * r;
        double impartirea = inmultirea1 / 8;
        double adunarea1 = 20 + impartirea;
        System.out.println(adunarea1);
    }

    public static void ex4d() {
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(d);
    }


    public static double transFinC(int x) {
        double gradeC = (x - 32) * 5.0 / 9;
        return gradeC;
    }

    public static double transfInchM(double x) {
        double distMetri = x / 39.370;
        return distMetri;
    }

    public static void myRobot() {
        String robotel = "   +\" \" \" \" \"+\n" +
                "  [|  o   o  |]\n" +
                "   |    ^    |\n" +
                "   |   '_'   |\n" +
                "   +_ _ _ _ _+";
        System.out.println(robotel);

    }


}








