package com.company;

public class Calculator {

    public int adunare(int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public int adunare(int primulNumar, int alDoileaNumar, int alTreileaNumar){
        int rezultat = primulNumar + alDoileaNumar + alTreileaNumar;
        return rezultat;
    }

    public double adunare(int primulNumar, double alDoileaNumar){
        double rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public double adunare(double primulNumar, double alDoileaNumar){
        double rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }



    public int scadere(int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public int scadere(int primulNumar, int alDoileaNumar, int alTreileaNumar){
        int rezultat = primulNumar - alDoileaNumar - alTreileaNumar;
        return rezultat;
    }

    public double scadere(int primulNumar, double alDoileaNumar){
        double rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public double scadere(double primulNumar, double alDoileaNumar){
        double rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }


    public int inmultire (int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public int inmultire (int primulNumar, int alDoileaNumar,int alTreileaNumar){
        int rezultat = primulNumar * alDoileaNumar * alTreileaNumar;
        return rezultat;
    }

    public double inmultire (int primulNumar, double alDoileaNumar){
        double rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public double inmultire (double primulNumar, double alDoileaNumar){
        double rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public double impartire (double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public int impartire (int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public double impartire (int primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public double impartire (double primulNumar, int alDoileaNumar) {
        double rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }


    public double mediaAtreiNumere (double primulNumar, double alDoileaNumar, double alTreileaNumar){
        double rezultat = (primulNumar+alDoileaNumar+alTreileaNumar)/3;
        return rezultat;
    }

    public int restulImpartirii (int primulNumar, int alDoileaNumar){
        int restImp = primulNumar%alDoileaNumar;
        return restImp;
    }

    public void countTo100 (int i){
        while (i<=100){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n");
    }

    public void countToMinus100 (int i){
        while (i>=-100){
            System.out.print(i+" ");
            i--;
        }
        System.out.println("\n");
    }

    public void countXToY (int x, int y){
        while (x<=y){
            System.out.print(x+" ");
            x++;
        }
        System.out.println("\n");
    }

    public void countXtoY2 (int x, int y){
        if (x<y) {
            while (x<=y){
                System.out.print(x+" ");
                x++;
            }
        } else if (x>y) {
            while (y<=x){
                System.out.print(y+" ");
                y++;
            }
        }
        else System.out.println("Numerele sunt egale \n");
        System.out.println("\n");
    }

    public void whileEven (){
        int x = 1;
        while (x<=100){
            if (x%2==0)
                System.out.print(x+" ");
                x++;
        }
        System.out.println("\n");
    }

    public void whileOdd (){
        int x = 1;
        while (x<=100){
            if (x%2!=0)
                System.out.print(x+" ");
            x++;
        }
        System.out.println("\n");
    }

    public void whileSum111And8899 (){
        int x = 111 ;
        int count = 0;
        int sum = 0;
        while (x<=8899){
            sum += x;
            count++;
            x++;
        }
        System.out.println("Suma numerelor este : "+sum);
        System.out.println("Media numerelor este : "+ sum/count);
        System.out.println("\n");
    }

    public float whilePrime7 (int x, int y){
        float count =0F;
        float sum = 0F;
        while (x<=y) {
            if (x % 7 == 0) {
                count += 1;
                sum += x;
            }
            x++;
        }
        float average = sum/count;
        System.out.print("Media numerelor din intervalul selectat este: ");
        return  average;

    }

    public void fibonacci () {
        int x = 0;
        int y = 1;
        int endCount = 20;
        int count = 1;
        while (count <= endCount) {
            int sum = x + y;
            x = y;
            y = sum;
            System.out.println(sum);
            count++;
        }
        System.out.println("\n");
    }

    public void cozaLozaWoza (){
        int i=1;
        while (i<=110){
            if (i%11==0){
                System.out.println(i+"\n");
            } else if ((i%3==0) && (i%5==0) && (i%7==0)){
                System.out.print("CozaLozaWoza ");
            } else if ((i%5==0) && (i%7==0)){
                System.out.print("WozaLoza ");
            } else if ((i%3==0) && (i%7==0)){
                System.out.print("CozaWoza ");
            }else if ((i%3==0) && (i%5==0)){
                System.out.print("CozaLoza ");
            }else if (i%7==0){
                System.out.print("Woza ");
            }else if (i%5==0){
                System.out.print("Loza ");
            }else if (i%3==0){
                System.out.print("Coza ");
            } else
                System.out.print(i+" ");
                i++;

        }
    }








  }


