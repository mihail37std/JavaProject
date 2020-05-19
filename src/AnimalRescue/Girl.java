package AnimalRescue;

public class Girl extends Rescuer {

    private long buget;


    public long getBuget(){
        return buget;
    }
    public void setBuget (long age){
        this.buget = buget;
    }



    public void buyFood (){
        System.out.println("Buying dog's food");
    }


    public void callVeterinarian (){
        System.out.println("Call the vet for an appointment for the dog");
    }

    public void walkDog (){
        System.out.println("Girl walking dog");
    }

    public void takesPetToVet(){
        System.out.println("taking dog to the vet ");
    }









}
