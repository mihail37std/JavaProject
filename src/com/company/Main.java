package com.company;

import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
        op.printForLoop(97);
        System.out.println("Ex 2: \n");

        /* 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
         Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
          pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
          deoarece metoda afiseaza, nu returneaza    */

        op.printForLoop2(-89);
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

        System.out.println(op.addForNumbers(90));
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

        System.out.println(calc.whilePrime7(1,49)+"\n");
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
        System.out.println("\n");

        // --------------------------------------------------------------------------------

        System.out.println("Lab 13 : Java Arrays \n");

        // 1.In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele
        // conform principiului polimorfismului

        System.out.println("Ex 1: \n");
        System.out.println("Adunarea : ");
        System.out.println(calc.adunare(1,1,1));
        System.out.println(calc.adunare(2.3,4.5));
        System.out.println(calc.adunare(5, 3.7));

        System.out.println("\nScaderea: ");
        System.out.println(calc.scadere(10,3,1));
        System.out.println(calc.scadere(8,5.5));
        System.out.println(calc.scadere(6.8,7.9));

        System.out.println("\nInmultirea: ");
        System.out.println(calc.inmultire(5,7,9));
        System.out.println(calc.inmultire(10,6.5));
        System.out.println(calc.inmultire(8.7,6.9));

        System.out.println("\nImpartirea: ");
        System.out.println(calc.impartire(87.5,98.3));
        System.out.println(calc.impartire(58,6.5));
        System.out.println(calc.impartire(8.5,2));
        System.out.println("\nEx 2: \n");

        /*2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
         valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul. */

        int[] myArray =op.getArrayHundred();
        op.printArray(myArray);
        System.out.println("\n\nEx 3: \n");

        /*3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
        si sa il returneze populat cu toate valorile pare de la 1 la 100.
         Apelati metoda in main() pentru a verifica daca functioneaza.
        Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla. */


        op.printArray(op.getArrayEven());
        System.out.println("\n\nEx 4: \n");

        /*4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
         Metoda sa calculeze si sa returneze media numerelor din array.
         Apelati metoda in main() pentru a verifica daca functioneaza.*/

        int[] myArray2 = {10,24,39,45,59,67,190};
        System.out.println(op.getArrayAvarage(myArray2));
        System.out.println("\n\nEx5:\n");

        /*5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
         si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste
         in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.*/

        System.out.println(op.checkStringInAString(new String[]{"Mama", "Tata", "si", "Bunica", "Calul", "Floarea",
                                                    "si", "Pisica"},"Tata"));
        System.out.println("\nEx6:\n");

        /*6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
        si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
        si daca da, atunci sa returneze pozitia pe care se afla numarul. */

        System.out.println(op.checkArrayPosition(new int[]{3, 4, 5, 10, 8, 9},5));
        System.out.println("\nEx 7:\n");

        //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

        op.arrayScheme();
        System.out.println("\nEx 8:\n");

        /*8.Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
         si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
          sa returneze array-ul primit, fara acel numar. */

        op.printArray(op.returnArrayWithoutNr(new int[]{44,45,32,4,8,90},45));
        System.out.println("\n\nEx 9:\n");

        /*9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
         Apelati metoda in main() pentru a verifica daca functioneaza. */

        System.out.println("Al 2-lea cel mai mic nr din array este: "+op.secondSmallArrayNr(new int[]{100,8,12,20,56}));
        System.out.println("\nEx 10:\n");

        /*10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
         Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.   */

        int [] populatedArray = {4,5,23,31,44,56,79};
        int [] emptyArrayEx10 = new int[populatedArray.length];
        op.copyArray(populatedArray,emptyArrayEx10);
        op.printArray(emptyArrayEx10);




        System.out.println("\n\nTEMA OPTIONALA\n");

        // Ex 1 este identic cu ex 9 fiind rezolvat deja

        System.out.println("\nEx2:\n");

        //2. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.

        op.insertElementInArray(new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49},2,5);
        // Aici doar daca se sterge ultimul element din array , am reusit sa fac o metoda....sa insereze
        //si alt numar , si sa afiseze tot array-ul original plus numarul respectiv, nu stiu cum sa fac :)
        System.out.println("\nEx3:\n");

        //3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

        op.findMinAndMax(new int[]{120,246,356,432,555,697,702,840,999});
        System.out.println("\n\nEx4:\n");

        //4. Creati o metoda care sa inverseze valorile unui array de int-uri.

        int[] note= {8,7,10,5,3,9};
        int[] noteInversate ;
        noteInversate = op.reverseArray(note);
        System.out.println("Array-ul initial este:");
        op.printArray(note);
        System.out.println("\nIar array-ul inversat este : ");
        op.printArray(noteInversate);

        System.out.println("\nEx5:\n");

        //5. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.

        System.out.println("Duplicates String in the array are: \n");
        op.printArrayDuplicated(new String[]{"Avion","Avion","Capusa","Mama","Mama","pe asta vreau sa n-o vad"});
        System.out.println("\nDuplicates int in the array are:\n");
        op.printArrayDuplicated(new int[]{1, 2, 3, 4, 5, 4, 5, 6, 6, 7, 8, 9});
        System.out.println("\nEx6\n");

        //6. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).

        String[] first = {"ford" , "lambo", "vw" , "BMW" , "opel"};
        String[] second = {"vw", "BMW" , "Tesla"};
        op.similarValues(first, second);
        System.out.println("\n\nEx7:\n");

        //7. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

        op.sortArray(new int[]{9,4,6,8,3,7,1,10,5,2});


        System.out.println("\n\n\n    TEMA LAB 14 : JAVA LISTS \n");

        System.out.println("\nEx1:\n");
        //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
        // toate valorile din lista, fiecare pe rand nou.

        List<Integer> firstIntList = new ArrayList<Integer>();
        firstIntList.add(2);
        firstIntList.add(5);
        firstIntList.add(4);
        firstIntList.add(1);

        op.printList(firstIntList);

        System.out.println("\nEx2:\n");

        /*2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.*/

        op.addFinalNumberToList(firstIntList, 55);
        op.printList(firstIntList);
        System.out.println("\nEx3:\n");

        /*3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
        iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
         fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru. */

        op.printListFromIndex(firstIntList,2);
        System.out.println("\nEx4:\n");
        /*4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
         dar invers(de la capat la inceput).*/

        op.printListBackwards(firstIntList);
        System.out.println("\nEx5:\n");

        /*5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
         unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
         iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.*/

        List<String> firstStringList = new ArrayList<String>();
        firstStringList.add("Andrei");
        firstStringList.add("Danciulescu");
        firstStringList.add("Ana Maria");

        op.addStringToList(firstStringList,1,"Nicolae");
        op.printList(firstStringList);

        System.out.println("\nEx6:\n");

        /*6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
        iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista. */

        op.addFirstNrtoList(firstIntList,10);
        op.printList(firstIntList);
        System.out.println("\nEx7:\n");

        /*7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
        si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”)*/

        op.printListWithNrAndPosition(firstIntList);
        System.out.println("\nEx8:\n");

        //8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

        System.out.println("Cel mai mare numar din lista este: "+op.maxNrFromList(firstIntList));
























































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








