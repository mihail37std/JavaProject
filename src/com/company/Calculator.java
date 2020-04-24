package com.company;

public class Calculator {

    public int adunare(int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }


    public int scadere(int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public int inmultire (int primulNumar, int alDoileaNumar){
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public double impartire (double primulNumar, double alDoileaNumar) {
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



  }


