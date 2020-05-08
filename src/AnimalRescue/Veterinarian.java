package AnimalRescue;

public class Veterinarian extends MedicalStaff{

    private String specialization ;


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public void prescribeRecipes (){
        System.out.println("Prescribe recipes....");
    }
}
