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

        System.out.println("\n          First Dog\n");
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
        System.out.println("\n Dog activities\n");

        firstDog.run();
        firstDog.eat();
        firstDog.speak();
        firstDog.chaseCats();
        firstDog.gnawsBone();
        firstDog.walk();
        firstDog.guards();
        firstDog.scratch();
        firstDog.love();
        System.out.println(" ");


        // ------------------------------------------------------------

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

        System.out.println("\n                CAT1\n");
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
        System.out.println("\n Cat1 activities\n");
        cat1.eat();
        cat1.sleep();
        cat1.speak();
        cat1.play();
        cat1.chasing();
        cat1.love();
        cat1.purr();

        //------------------------------------------------------------

        Chicken chiki = new Chicken();
        chiki.setName("Chiki");
        chiki.setAge(1);
        chiki.setWeight(0.5F);
        chiki.setFavFood("corn");
        chiki.setFavActivity("Eating, off course ");

        System.out.println("\n      Chicken\n");
        System.out.println(chiki.getName());
        System.out.println(chiki.getAge());
        System.out.println(chiki.getWeight());
        System.out.println(chiki.getFavFood());
        System.out.println(chiki.getFavActivity());
        System.out.println("\n Chicken activities\n");
        chiki.eat();
        chiki.speak();
        chiki.lays();

        //---------------------------------------------

        Girl girl = new Girl();

        girl.setName("Maria");
        girl.setAge(12);
        girl.setBuget(187490456L);
        girl.setHeight(120);
        girl.setWeight(45.5F);
        girl.setHair("Long and Brown");
        girl.setGender("female");
        girl.setEyes("green");

        System.out.println("\n       Girl MARIA \n");
        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getBuget());
        System.out.println(girl.getHeight());
        System.out.println(girl.getWeight());
        System.out.println(girl.getHair());
        System.out.println(girl.getGender());
        System.out.println(girl.getEyes());
        System.out.println("\n Girl activities\n ");
        girl.buyFood();
        girl.callVeterinarian();
        girl.walkDog();
        girl.takesPetToVet();
        System.out.println(" ");

        //-------------------------------------------------
        Boy boy1 = new Boy();
        boy1.setName("Andrei");
        boy1.setAge(29);
        boy1.setEyes("Blue eyes");
        boy1.setGender("Masculin");
        boy1.setHair("Curly hair");
        boy1.setHeight(193);
        boy1.setWeight(89);

        System.out.println("\n           BOY1\n");
        System.out.println("Boy1 name: "+boy1.getName());
        System.out.println("Age : "+boy1.getAge());
        System.out.println("Eyes: "+boy1.getEyes());
        System.out.println("Gender: "+boy1.getGender());
        System.out.println("Hair: "+boy1.getHair());
        System.out.println("Height: "+boy1.getHeight());
        System.out.println("Weight: "+boy1.getWeight());
        System.out.println("\n BOY's activities\n");
        boy1.adopt();
        boy1.buyFood();
        boy1.feed();
        boy1.callVeterinarian();
        boy1.spending();
        boy1.play();
        boy1.sleep();
        boy1.walking();
        boy1.applyMedicalTreatment();
        System.out.println(" ");

        //-------------------------------------------------

        Veterinarian theDoctor = new Veterinarian();

        theDoctor.setName("Codea Vasile");
        theDoctor.setAge(55);
        theDoctor.setSpecialization("Clinician pe animale mici");
        theDoctor.setPrice(150);
        theDoctor.setAccesories("Stetoscop");

        System.out.println("\n         THE VETERINARIAN \n");
        System.out.println(theDoctor.getName());
        System.out.println(theDoctor.getAge());
        System.out.println(theDoctor.getSpecialization());
        System.out.println(theDoctor.getPrice());
        System.out.println(theDoctor.getAccesories());
        System.out.println("\n Veterinarian activities\n");
        theDoctor.consult();
        theDoctor.treats();
        theDoctor.giveInjection();
        theDoctor.performSurgery();
        theDoctor.prescribeRecipes();
        System.out.println(" ");

        //-------------------------------------------------------
        Nurse nurse1 = new Nurse();

        nurse1.setName("Adriana");
        nurse1.setAge(40);
        nurse1.setAccesories("Halat");

        System.out.println("\n         NURSE\n");
        System.out.println(nurse1.getName());
        System.out.println(nurse1.getAge());
        System.out.println(nurse1.getAccesories());
        System.out.println("\n Nurse activities\n");
        nurse1.consult();
        nurse1.prepareSurgeryRoom();
        nurse1.treats();

        //-------------------------------------------------------
        DogFood mancarea1 = new DogFood();

        mancarea1.setName("Royal Canin Starter Maxi");
        mancarea1.setPrice(101);
        mancarea1.setQuantity(4);
        mancarea1.setStock(400);
        mancarea1.setColor("Brownish");
        mancarea1.setConsistency("Boabe");

        System.out.println("\n      DOG'S FOOD\n");
        System.out.println(mancarea1.getName());
        System.out.println(mancarea1.getPrice());
        System.out.println(mancarea1.getQuantity());
        System.out.println(mancarea1.getStock());
        System.out.println(mancarea1.getColor());
        System.out.println(mancarea1.getConsistency());
        System.out.println(" ");

        // ----------------------------------------------------------------------------------

        CatFood mancarea2 = new CatFood();

        mancarea2.setName("Wiskas ");
        mancarea2.setPrice(120);
        mancarea2.setQuantity(8);
        mancarea2.setStock(50);
        mancarea2.setColor("Brownish");
        mancarea2.setConsistency("Consistenta moale");

        System.out.println("\n       CAT'S FOOD \n");
        System.out.println(mancarea2.getName());
        System.out.println(mancarea2.getPrice());
        System.out.println(mancarea2.getQuantity());
        System.out.println(mancarea2.getStock());
        System.out.println(mancarea2.getColor());
        System.out.println(mancarea2.getConsistency());
        System.out.println(" ");


        // ----------------------------------------------------

        RelaxingActivity relaxActiv = new RelaxingActivity();

        relaxActiv.setName("Fetch the ball");

        System.out.println("\n        RELAXING ACTIVITY\n");
        System.out.println(relaxActiv.getName());
        System.out.println(" ");

        //-----------------------------------------------------













    }

}
