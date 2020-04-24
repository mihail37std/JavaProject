package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        // Animal myObject = new Animal();

        Animal firstDog = new Animal();

        firstDog.setName("Aurel");
        firstDog.setAge(3);
        firstDog.setColor("Black and white");
        firstDog.setRace("Ciobanesc caucazian");
        firstDog.setChipNr(371012);
        firstDog.setWeight(23.5F);
        firstDog.setEyesColor("brown");
        firstDog.setLeash("black");
        firstDog.setTeeth("white");
        firstDog.setTail("long");
        firstDog.setGendre("Male");
        firstDog.setHealthLevel(10);
        firstDog.setHungerLevel(10);
        firstDog.setMoodLevel(10);
        firstDog.setFavFood("Royal Canin Starter Maxi");
        firstDog.setFavActivity("playing with the ball");


        System.out.println(firstDog.getName());
        System.out.println(firstDog.getAge());
        System.out.println(firstDog.getColor());
        System.out.println(firstDog.getRace());
        System.out.println(firstDog.getChipNr());
        System.out.println(firstDog.getWeight());
        System.out.println(firstDog.getEyesColor());
        System.out.println(firstDog.getLeash());
        System.out.println(firstDog.getTeeth());
        System.out.println(firstDog.getTail());
        System.out.println(firstDog.getGendre());
        System.out.println(firstDog.getHealthLevel());
        System.out.println(firstDog.getHungerLevel());
        System.out.println(firstDog.getMoodLevel());
        System.out.println(firstDog.getFavFood());
        System.out.println(firstDog.getFavActivity());
        System.out.println(" ");

        // ------------------------------------------------------------

        RelaxingActivity relaxActiv = new RelaxingActivity();

        relaxActiv.setName("Fetch the ball");
        System.out.println(relaxActiv.getName());
        System.out.println(" ");

        //------------------------------------------------------------

        Veterinarian theDoctor = new Veterinarian();

        theDoctor.setName("Codea Vasile");
        theDoctor.setAge(55);
        theDoctor.setSpecialization("Clinician pe animale mici");
        theDoctor.setPrice(150);
        theDoctor.setAccesories("Stetoscop");

        System.out.println(theDoctor.getName());
        System.out.println(theDoctor.getAge());
        System.out.println(theDoctor.getSpecialization());
        System.out.println(theDoctor.getPrice());
        System.out.println(theDoctor.getAccesories());
        System.out.println(" ");

        //-------------------------------------------------------------

        Adaptator girl = new Adaptator();

        girl.setName("Maria");
        girl.setAge(12);
        girl.setBuget(187490456L);
        girl.setHeight(120);
        girl.setWeight(45.5F);
        girl.setHair("Long and Brown");
        girl.setGender("female");
        girl.setEyes("green");

        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getBuget());
        System.out.println(girl.getHeight());
        System.out.println(girl.getWeight());
        System.out.println(girl.getHair());
        System.out.println(girl.getGender());
        System.out.println(girl.getEyes());
        System.out.println(" ");

        //-------------------------------------------------------

        Food mancarea1 = new Food();

        mancarea1.setName("Royal Canin Starter Maxi");
        mancarea1.setPrice(101);
        mancarea1.setQuantity(4);
        mancarea1.setStock(400);
        mancarea1.setColor("Brownish");
        mancarea1.setConsistency("Boabe");


        System.out.println(mancarea1.getName());
        System.out.println(mancarea1.getPrice());
        System.out.println(mancarea1.getQuantity());
        System.out.println(mancarea1.getStock());
        System.out.println(mancarea1.getColor());
        System.out.println(mancarea1.getConsistency());

        /*System.out.println(myObject.name);
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

         */





    }

}
