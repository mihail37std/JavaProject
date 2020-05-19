package AnimalRescue;

public class Veterinarian extends MedicalStaff{

    private String specialization ;


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public void consult (){
        System.out.println("Consulting the animal");
    }

    public void treats(){
        System.out.println("Treats the animal");
    }

    public void giveInjection () {
        System.out.println("Gives injection..");
    }

    public void performSurgery (){
        System.out.println("Performing surgery on animal");
    }

    public void prescribeRecipes (){
        System.out.println("Prescribe recipes....");
    }
}
