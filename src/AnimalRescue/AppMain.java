package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {

        // Animal myObject = new Animal();

        Dog firstDog = new Dog();

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

        Girl girl = new Girl();

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

        DogFood mancarea1 = new DogFood();

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
        System.out.println(" ");

        //--------------------------------------------------------

        Cat cat1= new Cat();
        cat1.setName("Buburuza");
        cat1.setAge(1);
        cat1.setColor("White");
        cat1.setRace("Pisica persana");
        cat1.setChipNr(259687);
        cat1.setWeight(9.5F);
        cat1.setEyesColor("black");
        cat1.setGendre("Female");
        cat1.setHealthLevel(10);
        cat1.setHungerLevel(10);
        cat1.setMoodLevel(10);
        cat1.setFavFood("Wiskas");
        cat1.setFavActivity("playing with the clew");

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getColor());
        System.out.println(cat1.getRace());
        System.out.println(cat1.getChipNr());
        System.out.println(cat1.getWeight());
        System.out.println(cat1.getEyesColor());
        System.out.println(cat1.getGendre());
        System.out.println(cat1.getHealthLevel());
        System.out.println(cat1.getHungerLevel());
        System.out.println(cat1.getMoodLevel());
        System.out.println(cat1.getFavFood());
        System.out.println(cat1.getFavActivity());
        System.out.println(" ");

        // ----------------------------------------------------------------------------------

        CatFood mancarea2 = new CatFood();

        mancarea2.setName("Wiskas ");
        mancarea2.setPrice(120);
        mancarea2.setQuantity(8);
        mancarea2.setStock(50);
        mancarea2.setColor("Brownish");
        mancarea2.setConsistency("Consistenta moale");


        System.out.println(mancarea2.getName());
        System.out.println(mancarea2.getPrice());
        System.out.println(mancarea2.getQuantity());
        System.out.println(mancarea2.getStock());
        System.out.println(mancarea2.getColor());
        System.out.println(mancarea2.getConsistency());
        System.out.println(" ");







    }

}
