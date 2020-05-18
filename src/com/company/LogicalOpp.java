package com.company;


import java.util.Arrays;

public class LogicalOpp {

    public int getHigherNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public String checkTextFastTrack(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String checkTextAndNumber(String text, int nr) {
        if ((text.equals("FastTrackIT")) && (nr <= 3)) {
            return text + nr;
        } else if ((!text.equals("FastTrackIT")) && (nr >= 4)) {
            return nr + text;
        }
        return "Nicio conditie indeplinita";

    }

    public String checkSnow(int nr) {
        if ((nr > 8) || nr == 6) {
            return "The amount of snow this winter was(cm): " + nr;
        } else
            return "The forecast snow is(cm): " + nr;
    }

    public void printNumber(int caseNumber) {
        switch (caseNumber) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            case 10:
                System.out.println("The number is 10");
                break;
            case 11:
                System.out.println("The number is 11");
                break;
            default:
                System.out.println("The number you entered is inccorect ");
        }

    }


    public String verifyNumber(int nr) {
        if ((nr > 3) && (!(nr == 4))) {
            return "The number is greater than 3 and not equal to 4";
        } else if (nr == 4) {
            return "The number is equal to 4";
        } else if (nr < 3) {
            return "The number is lower than 3";
        }
        return "The number is equal to 3  "; // aceasta conditie nu era in enunt, si daca nr era 3 prog nu facea nimic
    }

    public boolean isNumberEven(int numarul) {
        if (numarul % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isEligibleToVote(int varsta) {
        if (varsta > 18)
            return true;
        else
            return false;
    }

    public int biggestNumber(int primulNumar, int alDoileaNumar, int alTreileaNumar) {
        if ((primulNumar > alDoileaNumar) && (primulNumar > alTreileaNumar))
            return primulNumar;
        else if ((alDoileaNumar > primulNumar) && (alDoileaNumar > alTreileaNumar))
            return alDoileaNumar;
        else if ((alTreileaNumar > primulNumar) && (alTreileaNumar > alDoileaNumar))
            return alTreileaNumar;
        else if ((primulNumar > alDoileaNumar) || (primulNumar > alTreileaNumar))
            return primulNumar;
        else if ((alDoileaNumar > primulNumar) || (alDoileaNumar > alTreileaNumar))
            return alDoileaNumar;
        else if ((alTreileaNumar > primulNumar) || (alTreileaNumar > alDoileaNumar))
            return alTreileaNumar;
        else return primulNumar;
    }


    public void printForLoop(int x) {
        for (x = x; x <= 100; x++) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public void printForLoop2(int x) {
        for (x = x; x >= -100; x--) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public void printTwoParameters(int x, int y) {
        for (x = x; x <= y; x++) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public void printTwoParameters2(int x, int y) {
        if (x <= y) {
            for (x = x; x <= y; x++) {
                System.out.print(x + " ");
            }
        } else
            for (y = y; y <= x; y++) {
                System.out.print(y + " ");
            }
        System.out.println("\n");
    }

    public void printEven() {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("\n");
    }

    public void printOdd() {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("\n");
    }

    public int addForNumbers(int x) {
        int sum = 0;
        int count = 0;
        for (x = x; x < 100; x++) {
            sum = sum + x;
        }
        return sum;
    }

    public float addForNumbers2(int x) {
        float sum = (float) 0.0;
        int count = 0;
        for (x = x; x < 100; x++) {
            sum = sum + x;
            count = count + 1;
        }
        System.out.print("Media este: ");
        return sum / count;
    }

    public void theStarsSchemee() {
        int x, y;
        for (x = 7; x > 0; x--) {
            for (y = x; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public int[] getArrayHundred() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
    }

    public int[] getArrayEven(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                System.out.print(array[i]+" ");
            }
        }
        return array;
    }

    public double getArrayAvarage(int[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count += 1;
        }
        return sum / count;
    }

    public boolean checkStringInAString(String[] myStringArray, String strSimplu) {
        for (String i : myStringArray) {
            if (i.equals(strSimplu))
                return true;
        }
        return false;
    }

    public int checkArrayPosition(int[] array, int nr) {
        int brio = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nr) {
                System.out.print("Adevarat! Nr se afla in array iar pozitia nr este: ");
                brio = i;
            }
        }
        return brio;
    }

    public void arrayScheme() {
        String[] line = new String[10];
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line.length; j++) {
                line[i] = "- ";
                System.out.print(line[i]);
            }
            System.out.println();
        }
    }

    public int[] returnArrayWithoutNr (int[] array, int nr){
        int[] newArray = new int[array.length-1];
        for(int i=0 , j=0; i<array.length ; i++){
             if (array[i]!=nr) {
                 newArray[j]=array[i];
                 j++;
             }

         } return newArray;

    }

    public int secondSmallArrayNr(int[] array) {
        Arrays.sort(array);
        return array[1];

    }

    public void copyArray(int[] array,int[] arrayEmplty){
        for(int i=0; i<array.length;i++){
            arrayEmplty[i]=array[i];
        }
    }


    public int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0, j = reverse.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public void findMinAndMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println("Cel mai mic nr din array este : " + min);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.print("Cel mai mare nr din array este : " + max);
    }

    public void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.print("Array-ul primit, aranjat crescator arata astfel: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void printArrayDuplicated(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);

                }
            }
        }
    }

    public void printArrayDuplicated(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]==(array[j])) {
                    System.out.println(array[i]);

                }
            }
        }
    }

    public void insertElementInArray (int[] array, int index, int nr){
        System.out.println("Original Array : "+Arrays.toString(array));

        for(int i=array.length-1; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = nr;
        System.out.println("New Array: "+Arrays.toString(array));
    }
}






