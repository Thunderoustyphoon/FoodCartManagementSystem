public class PizzaCart extends FoodItem {
    // public String name;
    public String size;
    public static int pizzaCount;
    
    // Default constructor
    public PizzaCart() {
        super(); // This calls the FoodItem parent constructor!
        // this.name = "";
    }

    {
        pizzaCount+=1;
    }
    
    // Parameterized constructor
    public PizzaCart(String name, double price, int quantity) {
        super(name, price, quantity);
        // this.name = name;
    }

    public void choosePizza(int n) {
        switch (n) {
            case 1:
                this.name = "Onion pizza";
                this.price = 80.0;  // Modifying the price inherited from FoodItem
                System.out.println(name + " (80.0) Added To cart");                
                break;
            case 2:
                this.name = "Tomato Pizza";
                this.price = 70.0;  
                System.out.println(name  + " (70.0) Added To cart");
                break;
            case 3:
                this.name = "Indi Tandoori pizza";
                this.price = 250.0;  
                System.out.println(name + " (250.0) Added To cart");
                break;
            case 4:
                this.name = "Farm House Pizza";
                this.price = 350.0;  
                System.out.println(name + " (350.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    // Getters and Setters
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }

    public void chooseSize(int n){
        switch (n) {
            case 1:
                this.size = "Regular";
                System.out.println("You have Choosen a " + this.size + " " + this.name);   
                break;

            case 2:
                this.size = "Medium";
                this.price = this.price + 30;
                System.out.println("You have Choosen a " + this.size + " " + this.name);
                break;

                case 3:
                this.size = "Large";
                this.price = this.price + 60;
                System.out.println("You have Choosen a " + this.size + " " + this.name);    
                break;
        
            default:
                System.out.println("Your Coldrink is Small " + this.name );
                break;
        }
    }
}