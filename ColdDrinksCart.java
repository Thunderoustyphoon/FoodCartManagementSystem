public class ColdDrinksCart extends FoodItem {
    public boolean icedOrNot;
    public String coldDrinkType;
    public String size;
    public static int drinksCount;

    public ColdDrinksCart() {
        super(); // Calls the FoodItem parent constructor
        this.icedOrNot = false;
        this.coldDrinkType = "";
        this.size = "Small";
    }

    {
        drinksCount+=1;
    }
    
    public ColdDrinksCart(String name, double price, int quantity, String coldDrinkType) {
        super(name, price, quantity);
        this.coldDrinkType = coldDrinkType;
        this.icedOrNot = false;
        this.size = "Small";
    }

    public void chooseDrink(int n) {
        switch (n) {
            case 1:
                this.coldDrinkType = "Coca Cola";
                this.price = 60.0;  
                System.out.println(coldDrinkType + " (60.0) Added To cart");                
                break;
            case 2:
                this.coldDrinkType = "Sprite";
                this.price = 50.0;  
                System.out.println(coldDrinkType + " (50.0) Added To cart");
                break;
            case 3:
                this.coldDrinkType = "Maza";
                this.price = 40.0;  
                System.out.println(coldDrinkType + " (40.0) Added To cart");
                break;
            case 4:
                this.coldDrinkType = "Pepsi";
                this.price = 60.0;  
                System.out.println(coldDrinkType + " (60.0) Added To cart");
                break;
            default:
                System.out.println("Invalid Choice. Choose a number between 1 and 4.");
                break;
        }
    }
    
    public void addIce() {
        this.icedOrNot = true;
        this.price = this.price + 10.0; // Adds 10 to the base price of the drink
        System.out.println("Ice Added to your " + coldDrinkType + " (Extra 10.0)");
    }
    
    public String getColdDrinkType() {
        return coldDrinkType;
    }
    
    public void setColdDrinkType(String coldDrinkType) {
        this.coldDrinkType = coldDrinkType;
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
                System.out.println("You have Choosen a " + this.size + " " + this.coldDrinkType);   
                break;

            case 2:
                this.size = "Medium";
                this.price = this.price + 20;
                System.out.println("You have Choosen a " + this.size + " " + this.coldDrinkType);
                break;

                case 3:
                this.size = "Large";
                this.price = this.price + 30;
                System.out.println("You have Choosen a " + this.size + " " + this.coldDrinkType);    
                break;
        
            default:
                System.out.println("Your Coldrink is Small " + this.coldDrinkType );
                break;
        }
    }
}