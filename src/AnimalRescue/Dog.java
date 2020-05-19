package AnimalRescue;

public class Dog extends Animal {

    private int chipNr ;
    private String leash ;
    private String teeth ;
    private String tail ;

    public int getChipNr() {
        return chipNr;
    }

    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
    }

    public String getLeash() {
        return leash;
    }

    public void setLeash(String leash) {
        this.leash = leash;
    }

    public String getTeeth() {
        return teeth;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }



    public void speak(){
        System.out.println("wouf wouf");
    }

    public void eat(){
        System.out.println("Eating Dog's food");
    }

    public void run(){
        System.out.println("running to catch cats");
    }

    public void chaseCats (){
        System.out.println("Chasing cats");
    }


    public void gnawsBone (){
        System.out.println("Gnaws a bone");
    }

    public void walk (){
        System.out.println("Walks with ....");
    }

    public void guards (){
        System.out.println("Guarding the family");
    }

    public void scratch (){
        System.out.println("Scratching....");
    }

    public void love (){
        System.out.println("loving the girl....who doesn't? :D ");
    }







}
