package AnimalRescue;

public class Rescuer {

    private String name;
    private int age;
    private int height;
    private float weight;
    private String hair;
    private String eyes;
    private String gender;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }


    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }


    public int getHeight(){
        return height;
    }
    public void setHeight (int height){
        this.height = height;
    }

    public float getWeight (){
        return weight;
    }
    public void setWeight (float weight){
        this.weight = weight;
    }


    public String getHair (){
        return hair;
    }
    public void setHair (String hair){
        this.hair = hair;
    }


    public String getEyes (){
        return eyes;
    }
    public void setEyes (String eyes){
        this.eyes = eyes;
    }

    public String getGender (){
        return gender;
    }
    public void setGender (String gender){
        this.gender = gender;
    }


    public void callVeterinarian(){
        System.out.println("Call the vet");
    }

    public void buyFood(){
        System.out.println("buying food");
    }

    public void play(){
        System.out.println("Playing...");
    }
    public void adopt (){
        System.out.println("Adopting...");
    }

    public void feed (){
        System.out.println("feeding...");
    }

    public void applyMedicalTreatment (){
        System.out.println("Aplying medical treatment...");
    }

    public void sleep (){
        System.out.println("zZzzzz....");
    }

    public void walking (){
        System.out.println("walking ...");
    }



}
