package AnimalRescue;

public class MedicalStaff {

    private String name ;
    private int age ;
    private int price ;
    private String accesories ;


    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }


    public int getAge (){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }


    public int getPrice (){
        return price;
    }
    public void setPrice (int price){
        this.price = price;
    }


    public String getAccesories (){
        return accesories;
    }
    public void setAccesories (String accesories){
        this.accesories = accesories;
    }






    public void consult (){
        System.out.println("Consulting ....");
    }

    public void treats (){
        System.out.println("treating....");
    }


}
