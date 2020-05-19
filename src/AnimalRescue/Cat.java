package AnimalRescue;

public class Cat extends Animal {

    private int chipNr ;

    public int getChipNr() {
        return chipNr;
    }

    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
    }

    public void eat(){
        System.out.println("eating cat's food ");
    }

    public void speak(){
        System.out.println("Meow!");
    }


    public void play(){
        System.out.println("Playing with the clew");
    }

    public void chasing(){
        System.out.println("Chasing mouse");
    }

    public void love (){
        System.out.println("loving ");
    }

    public void purr (){
        System.out.println("Purring...");
    }



}
