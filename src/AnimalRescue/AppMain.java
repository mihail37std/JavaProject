package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        Dog myObject = new Dog();

        System.out.println(myObject.name);
        System.out.println(myObject.age);
        System.out.println(myObject.chipNr);
        System.out.println(myObject.color);
        System.out.println(myObject.eyesColor);
        System.out.println(myObject.favActivity);
        System.out.println(myObject.favFood);
        System.out.println(myObject.gendre);
        System.out.println(myObject.healthLevel);
        System.out.println(myObject.hungerLevel);
        System.out.println(myObject.leash);
        System.out.println(myObject.moodLevel);
        System.out.println(myObject.race);
        System.out.println(myObject.tail);
        System.out.println(myObject.teeth);
        System.out.println(myObject.weight);
        System.out.println("    ");

        RelaxingActivity relaxAct = new RelaxingActivity();

        System.out.println(relaxAct.name);
        System.out.println("    ");

        Veterinarian vet = new Veterinarian();

        System.out.println(vet.accesories);
        System.out.println(vet.age);
        System.out.println(vet.name);
        System.out.println(vet.price);
        System.out.println(vet.specialization);
        System.out.println("    ");

        Adaptator girl = new Adaptator();

        System.out.println(girl.name);
        System.out.println(girl.age);
        System.out.println(girl.buget);
        System.out.println(girl.eyes);
        System.out.println(girl.gender);
        System.out.println(girl.hair);
        System.out.println(girl.height);
        System.out.println(girl.weight);
        System.out.println("     ");

        DogFood royal = new DogFood();

        System.out.println(royal.name);
        System.out.println(royal.color);
        System.out.println(royal.price);
        System.out.println(royal.quantity);
        System.out.println(royal.consistency);
        System.out.println(royal.stock);
        System.out.println("    ");





    }

}
