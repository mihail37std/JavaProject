package com.company;


public class LogicalOpp {

    public int getHigherNumber (int firstNumber, int secondNumber){
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else  {
            return secondNumber;
        }
    }

    public String checkTextFastTrack (String text){
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String checkTextAndNumber (String text , int nr) {
        if ((text.equals("FastTrackIT")) && (nr <= 3)) {
            return text + nr ;
        } else if ((!text.equals("FastTrackIT")) && (nr >= 4)){
            return nr + text ;
        } return "Nicio conditie indeplinita";

    }

    public String checkSnow (int nr){
        if ((nr > 8) || nr ==6) {
            return "The amount of snow this winter was(cm): "+nr;
        } else
            return "The forecast snow is(cm): "+nr;
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



    public String verifyNumber (int nr){
        if ((nr >3) && (!(nr == 4))){
            return "The number is greater than 3 and not equal to 4";
        } else if (nr == 4) {
            return "The number is equal to 4";
        } else if (nr < 3) {
            return "The number is lower than 3";
        } return "The number is equal to 3  "; // aceasta conditie nu era in enunt, si daca nr era 3 prog nu facea nimic
    }

    public boolean isNumberEven (int numarul){
        if (numarul%2 == 0)
            return true;
        else
            return false;
    }

    public boolean isEligibleToVote (int varsta){
        if (varsta > 18)
            return true;
        else
            return false;
    }

    public int biggestNumber (int primulNumar, int alDoileaNumar, int alTreileaNumar){
        if ((primulNumar>alDoileaNumar) && (primulNumar>alTreileaNumar))
            return primulNumar;
        else
            if ((alDoileaNumar>primulNumar) && (alDoileaNumar>alTreileaNumar))
                return alDoileaNumar;
            else if ((alTreileaNumar>primulNumar) && (alTreileaNumar>alDoileaNumar))
                return alTreileaNumar;
                 else if ((primulNumar>alDoileaNumar) || (primulNumar>alTreileaNumar))
                          return primulNumar;
                      else if ((alDoileaNumar>primulNumar) || (alDoileaNumar>alTreileaNumar))
                               return alDoileaNumar;
                           else if ((alTreileaNumar>primulNumar) || (alTreileaNumar>alDoileaNumar))
                                return alTreileaNumar;
                                else return primulNumar;
    }


    public void printPrintForLoop (int x){
        for (x=x ; x <= 100; x++){
            System.out.print(x+" ");
        }
        System.out.println("\n");
    }

    public void printPrintForLoop2 (int x){
        for (x=x ; x >= -100; x--){
            System.out.print(x+" ");
        }
        System.out.println("\n");
    }

    public void printTwoParameters (int x, int y){
        for (x=x; x <= y ; x++){
            System.out.print(x+" ");
        }
        System.out.println("\n");
    }

     public void printTwoParameters2 (int x, int y){
        if (x<=y) {
            for (x = x; x <= y; x++) {
                System.out.print(x+" ");
            }
        } else
        for (y=y; y <= x ; y++){
            System.out.print(y+" ");
        }
         System.out.println("\n");
     }

    public void printEven (){
        for (int x=1; x<=100 ; x++) {
            if (x%2==0){
                System.out.print(x+" ");
            }
        }
        System.out.println("\n");
    }

    public void printOdd (){
        for (int x=1; x<=100 ; x++) {
            if (x%2==1){
                System.out.print(x+" ");
            }
        }
        System.out.println("\n");
    }

    public void addForNumbers (int x){
        int sum=0;
        int count = 0;
        for (x=x; x<100;x++){
            sum = sum +  x  ;
        }
        System.out.println(sum+"\n");
    }

    public float addForNumbers2 (int x){
        float sum= (float) 0.0;
        int count = 0;
        for (x=x; x<100;x++){
            sum = sum +  x  ;
            count =count + 1 ;
        }
        System.out.print("Media este: ");
        return sum/count ;
    }

    public void theStarsSchemee (){
        int x , y ;
        for (x=7 ; x > 0 ; x--) {
            for (y = x; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }










}
