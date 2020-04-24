package AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private String  color ;
    private String race ;
    private int chipNr ;
    private float weight ;
    private String eyesColor ;
    private String leash ;
    private String teeth ;
    private String tail ;
    private String gendre ;
    private int healthLevel ;
    private int hungerLevel ;
    private int moodLevel ;
    private String favFood ;
    private String favActivity ;


    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name ;
    }


    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }


    public String getColor(){
        return color ;
    }
    public void setColor (String color){
        this.color = color ;
    }


    public String getRace (){
        return race;
    }
    public void setRace (String race){
        this.race = race ;
    }


    public int getChipNr (){
        return chipNr;
    }
    public void setChipNr (int chipNr){
        this.chipNr = chipNr ;
    }


    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }


    public String getEyesColor(){
        return eyesColor;
    }
    public void setEyesColor (String eyesColor){
        this.eyesColor = eyesColor;
    }

    public String getLeash(){
        return leash;
    }
    public void setLeash (String leash){
        this.leash = leash;
    }


    public String getTeeth(){
        return teeth;
    }
    public void setTeeth(String teeth){
        this.teeth = teeth;
    }


    public String getTail(){
        return tail;
    }
    public void setTail(String tail){
        this.tail = tail;
    }


    public String getGendre (){
        return gendre;
    }
    public void setGendre (String gendre){
        this.gendre = gendre;
    }


    public int getHealthLevel (){
        return healthLevel;
    }
    public void setHealthLevel (int healthLevel){
        this.healthLevel = healthLevel;
    }


    public int  getHungerLevel (){
        return hungerLevel;
    }
    public void setHungerLevel (int hungerLevel){
        this.hungerLevel = hungerLevel;
    }


    public int getMoodLevel(){
        return moodLevel;
    }
    public void setMoodLevel (int moodLevel){
        this.moodLevel = moodLevel;
    }


    public String getFavFood(){
        return favFood;
    }
    public void setFavFood(String favFood){
        this.favFood = favFood ;
    }


    public String getFavActivity(){
        return favActivity;
    }
    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }




    public void eat(){
        System.out.println("Eating..");
    }

    public void run(){
        System.out.println("running..");
    }

    public void sleep(){
        System.out.println("ZzzZZzz..");
    }

    public void bark(){
        System.out.println("wouf wouf");
    }

    public void chaseCats (){
        System.out.println("Chasing cats");
    }

    public void smell (){
        System.out.println("Smelling something");
    }

    public void hear (){
        System.out.println("Hearing its name");
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

    public void fearsDoctors (){
        System.out.println("fears the doctor");
    }






}
