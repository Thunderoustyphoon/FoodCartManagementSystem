public class BurgerCart extends FoodItem {
    public boolean isCheeseAdded;
    // public String name;
    public static int burgerCount;

    public BurgerCart() {
        super(); // Calls the FoodItem parent constructor
        this.isCheeseAdded = false;
        // this.name = "";
    }

    {
        burgerCount+=1;
    }
    
    public BurgerCart(String name, double price, int quantity) {
        super(name, price, quantity);
        // this.name = name;
        this.isCheeseAdded = false;
    }

    public void chooseBurger(int n) {
        switch (n) {
            case 1:
                this.name = "Big Mac";
                this.price = 100.0;  
                System.out.println(name + " (100.0) Added To cart");                
                break;
            case 2:
                this.name = "Small Mac";
                this.price = 50.0;  
                System.out.println(name  + " (50.0) Added To cart");
                break;
            case 3:
                this.name = "Chicken Mac";
                this.price = 150.0;  
                System.out.println(name + " (150.0) Added To cart");
                break;
            case 4:
                this.name = "Paneer Mac";
                this.price = 140.0;  
                System.out.println(name + " (140.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    
    public void addCheese() {
        this.isCheeseAdded = true;
        this.price = this.price + 30.0; // Adds 30 to the base price of the burger
        System.out.println("Cheese Added to your " + name + " (Extra 30.0)");
    }
    
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }
    
    public void setCheeseAdded(boolean cheeseAdded) {
        this.isCheeseAdded = cheeseAdded;
    }
}