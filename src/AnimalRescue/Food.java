package AnimalRescue;

public class Food {

    private String name ;
    private int price ;
    private int quantity ;
    private int stock ;
    private String color ;
    private String consistency;

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }


    public int getPrice (){
        return price;
    }
    public void setPrice (int price){
        this.price = price;
    }


    public int getQuantity (){
        return quantity;
    }
    public void setQuantity (int quantity){
        this.quantity = quantity;
    }


    public int getStock (){
        return stock;
    }
    public void setStock (int stock){
        this.stock = stock;
    }


    public String getColor (){
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }


    public String getConsistency (){
        return consistency;
    }
    public void setConsistency (String consistency){
        this.consistency = consistency;
    }




    public void nourish (){
        System.out.println("nourishing...");
    }

    public void healt (){
        System.out.println("Keeps the teeth strong");
    }


}
