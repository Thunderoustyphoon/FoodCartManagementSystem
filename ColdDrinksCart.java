public class ColdDrinksCart extends FoodItem {
    public boolean icedOrNot;
    // public String name;
    public String size;
    public static int drinksCount;

    public ColdDrinksCart() {
        super(); // Calls the FoodItem parent constructor
        this.icedOrNot = false;
        // this.name = "";
        this.size = "Small";
    }

    {
        drinksCount+=1;
    }
    
    public ColdDrinksCart(String name, double price, int quantity) {
        super(name, price, quantity);
        // this.name = name;
        this.icedOrNot = false;
        this.size = "Small";
    }

    public void chooseDrink(int n) {
        switch (n) {
            case 1:
                this.name = "Coca Cola";
                this.price = 60.0;  
                System.out.println(name + " (60.0) Added To cart");                
                break;
            case 2:
                this.name = "Sprite";
                this.price = 50.0;  
                System.out.println(name + " (50.0) Added To cart");
                break;
            case 3:
                this.name = "Maza";
                this.price = 40.0;  
                System.out.println(name + " (40.0) Added To cart");
                break;
            case 4:
                this.name = "Pepsi";
                this.price = 60.0;  
                System.out.println(name + " (60.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    
    public void addIce() {
        this.icedOrNot = true;
        this.price = this.price + 10.0; // Adds 10 to the base price of the drink
        System.out.println("Ice Added to your " + name + " (Extra 10.0)");
    }
    
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public boolean isIced() {
        return icedOrNot;
    }
    
    public void setIced(boolean iced) {
        this.icedOrNot = iced;
    }

    public void chooseSize(int n){
        switch (n) {
            case 1:
                this.size = "Small";
                System.out.println("You have Choosen a " + this.size + " " + this.name);   
                break;

            case 2:
                this.size = "Medium";
                this.price = this.price + 20;
                System.out.println("You have Choosen a " + this.size + " " + this.name);
                break;

                case 3:
                this.size = "Large";
                this.price = this.price + 30;
                System.out.println("You have Choosen a " + this.size + " " + this.name);    
                break;
        
            default:
                System.out.println("Your Coldrink is Small " + this.name );
                break;
        }
    }
}