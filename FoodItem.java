public class FoodItem{
    public String name;
    public double price;
    public int quantity;

    public FoodItem(){
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }
    
    public FoodItem(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public double getTotalPrice(){
        return price * quantity;
    }

    public void addQuantity(){
        this.quantity+=1;
    }

    public void removeQuantity(){
        this.quantity-=1;
    }
}