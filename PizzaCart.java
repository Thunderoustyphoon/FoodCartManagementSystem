public class PizzaCart extends FoodItem {
    public String pizzaType;
    public String size;
    
    // Default constructor
    public PizzaCart() {
        super(); // This calls the FoodItem parent constructor!
        this.pizzaType = "";
    }
    
    // Parameterized constructor
    public PizzaCart(String name, double price, int quantity, String pizzaType) {
        super(name, price, quantity);
        this.pizzaType = pizzaType;
    }

    public void choosePizza(int n) {
        switch (n) {
            case 1:
                this.pizzaType = "Onion pizza";
                this.price = 80.0;  // Modifying the price inherited from FoodItem
                System.out.println(pizzaType + " (80.0) Added To cart");                
                break;
            case 2:
                this.pizzaType = "Tomato Pizza";
                this.price = 70.0;  
                System.out.println(pizzaType  + " (70.0) Added To cart");
                break;
            case 3:
                this.pizzaType = "Indi Tandoori pizza";
                this.price = 250.0;  
                System.out.println(pizzaType + " (250.0) Added To cart");
                break;
            case 4:
                this.pizzaType = "Farm House Pizza";
                this.price = 350.0;  
                System.out.println(pizzaType + " (350.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    
    // Getters and Setters
    public String getPizzaType() {
        return pizzaType;
    }
    
    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public void chooseSize(int n){
        switch (n) {
            case 1:
                this.size = "Regular";
                System.out.println("You have Choosen a " + this.size + " " + this.pizzaType);   
                break;

            case 2:
                this.size = "Medium";
                this.price = this.price + 30;
                System.out.println("You have Choosen a " + this.size + " " + this.pizzaType);
                break;

                case 3:
                this.size = "Large";
                this.price = this.price + 60;
                System.out.println("You have Choosen a " + this.size + " " + this.pizzaType);    
                break;
        
            default:
                System.out.println("Your Coldrink is Small " + this.pizzaType );
                break;
        }
    }
}