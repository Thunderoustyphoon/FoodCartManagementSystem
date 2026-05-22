public class BurgerCart extends FoodItem {
    public boolean isCheeseAdded;
    public String burgerType;

    public BurgerCart() {
        super(); // Calls the FoodItem parent constructor
        this.isCheeseAdded = false;
        this.burgerType = "";
    }
    
    public BurgerCart(String name, double price, int quantity, String burgerType) {
        super(name, price, quantity);
        this.burgerType = burgerType;
        this.isCheeseAdded = false;
    }

    public void chooseBurger(int n) {
        switch (n) {
            case 1:
                this.burgerType = "Big Mac";
                this.price = 100.0;  
                System.out.println(burgerType + " (100.0) Added To cart");                
                break;
            case 2:
                this.burgerType = "Small Mac";
                this.price = 50.0;  
                System.out.println(burgerType  + " (50.0) Added To cart");
                break;
            case 3:
                this.burgerType = "Chicken Mac";
                this.price = 150.0;  
                System.out.println(burgerType + " (150.0) Added To cart");
                break;
            case 4:
                this.burgerType = "Paneer Mac";
                this.price = 140.0;  
                System.out.println(burgerType + " (140.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    
    public void addCheese() {
        this.isCheeseAdded = true;
        this.price = this.price + 30.0; // Adds 30 to the base price of the burger
        System.out.println("Cheese Added to your " + burgerType + " (Extra 30.0)");
    }
    
    public String getBurgerType() {
        return burgerType;
    }
    
    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }
    
    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }
    
    public void setCheeseAdded(boolean cheeseAdded) {
        this.isCheeseAdded = cheeseAdded;
    }
}