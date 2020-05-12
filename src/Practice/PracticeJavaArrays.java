package Practice;

import java.util.Arrays;

public class PracticeJavaArrays {
    public static void main(String[] args) {

        double[] grades = {96.5, 98.7, 88.4, 93.5, 86.9, 90.12};

        for (int i = 0; i <= 5; i++) {
            System.out.println("Nota " + i + " este " + grades[i]);
        }
        System.out.println("\n");

        int[] numbers = new int[10]; // asa initializez un array cu 10 valori
        // acuma s-a creat array-ul numbers si in interior e populat cu zero fiecare loc al sau

        for (int i = 0; i <= 9; i++) {   // functia pentru a popula array-ul nostru number
            numbers[i] = i * i;
        }

        for (int i = 0; i <= 9; i++) {   // functia afiseaza toate numerele din array
            System.out.println(i + " number from array is :" + numbers[i] + "\n");
        }


        // afisam nota maxim din array-ul nostru

        double max = grades[0];
        for (int i = 0; i <= 5; i++) {
            if (grades[i] > max) max = grades[i];
        }
        System.out.println("The maxim grade in the class is: " + max);

        System.out.println("\n");

        // afisam nota minima

        double min = grades[0];
        for (int i = 0; i <= 5; i++) {
            if (grades[i] < min) min = grades[i];
        }
        System.out.println("The minimum grade in the class is: " + min + "\n");

        //afisam media notelor

        double average = 0;
        double sumaNotelor = 0;
        for (int i = 0; i <= 5; i++) {
            sumaNotelor += grades[i];
            average += 1;
        }
        System.out.println("The average grade in the class is: " + sumaNotelor / average + "\n");

        /*   Mereu cand facem referire la coloane si la randuri pt arrays,
             incepem cu coloana 0 si randul 0  !


              25  40  58  34      - this is the row
              34  55  88  99
              11  17  28  10        / 3 rows and 4 columns

              |
            this is the column


         */

        int twoD[][] = new int[3][4];

        twoD[0][0] = 25;
        twoD[0][1] = 40;
        twoD[0][2] = 58;
        twoD[0][3] = 34;

        twoD[1][0] = 34;
        twoD[1][1] = 55;
        twoD[1][2] = 88;
        twoD[1][3] = 99;

        twoD[2][0] = 11;
        twoD[2][1] = 17;
        twoD[2][2] = 28;
        twoD[2][3] = 10;

        System.out.println(twoD[0][0] + " " + twoD[0][1] + " " + twoD[0][2] + " " + twoD[0][3] + " ");
        System.out.println(twoD[1][0] + " " + twoD[1][1] + " " + twoD[1][2] + " " + twoD[1][3] + " ");
        System.out.println(twoD[2][0] + " " + twoD[2][1] + " " + twoD[2][2] + " " + twoD[2][3] + " ");

        System.out.println("\n");

        /* exercitiu 1 : Create an array with 12 rows and 2 columns. The firs column
           will corespond to the month of the year such as January = 1 and December = 12.
           The second column will be the revenue you earn extra salary. Load and print
           the array
         */

        int[][] salaryA = new int[12][2];

        salaryA[0][0] = 1;   // put the months of the year in the array 1 column
        salaryA[1][0] = 2;
        salaryA[2][0] = 3;
        salaryA[3][0] = 4;
        salaryA[4][0] = 5;
        salaryA[5][0] = 6;
        salaryA[6][0] = 7;
        salaryA[7][0] = 8;
        salaryA[8][0] = 9;
        salaryA[9][0] = 10;
        salaryA[10][0] = 11;
        salaryA[11][0] = 12;

        salaryA[0][1] = 34;   // put the extra revenue in the array 2 coulmn
        salaryA[1][1] = 44;
        salaryA[2][1] = 23;
        salaryA[3][1] = 76;
        salaryA[4][1] = 65;
        salaryA[5][1] = 98;
        salaryA[6][1] = 123;
        salaryA[7][1] = 102;
        salaryA[8][1] = 87;
        salaryA[9][1] = 43;
        salaryA[10][1] = 34;
        salaryA[11][1] = 12;


        for (int i = 0; i <= 11; i++) {
            System.out.println("For month number " + salaryA[i][0] + " the extra revenue was " + salaryA[i][1]);
        }
        System.out.println("\n");

        // ex 2
    }
}

