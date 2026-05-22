import java.util.Scanner;

public class MainFoodCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to Food Cart Management System ===");
        
        boolean continueOrdering = true;
        double grandTotal = 0.0; // This will hold our final bill
        
        while(continueOrdering == true) {
            System.out.println("\n--- Choose Food Type ---");
            System.out.println("1. Burger");
            System.out.println("2. Cold Drinks");
            System.out.println("3. Pizza");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); 
            
            switch(choice) {
                case 1:
                    System.out.println("\n--- Burger Options ---");
                    System.out.println("1. Big Mac (100)");
                    System.out.println("2. Small Mac (50)");
                    System.out.println("3. Chicken Mac (150)");
                    System.out.println("4. Paneer Mac (140)");
                    System.out.print("Choose Burger Type: ");
                    int burgerChoice = sc.nextInt();
                    
                    System.out.print("Enter Quantity: ");
                    int burgerQty = sc.nextInt();
                    


                    // Burger Object 


                    BurgerCart burger = new BurgerCart();
                    burger.chooseBurger(burgerChoice);
                    burger.setQuantity(burgerQty);
                    



                    // For asking Add Cheese

                    System.out.print("Add Cheese ? (Press 1 for Yes, 2 for No): ");
                    int addCheese = sc.nextInt();
                    if(addCheese == 1) {
                        burger.addCheese(); 
                    }

                    // Order summary
                    
                    System.out.println("\n--- Order Summary ---");
                    System.out.println("Burger: " + burger.getname());
                    System.out.println("Total for this item: " + burger.getTotalPrice());
                    
                    // Add this item's price to our final bill
                    grandTotal = grandTotal + burger.getTotalPrice();
                    
                    break;
                    
                case 2:
                    System.out.println("\n--- Drink Options ---");
                    System.out.println("1. Coca Cola (60)");
                    System.out.println("2. Sprite (50)");
                    System.out.println("3. Maza (40)");
                    System.out.println("4. Pepsi (60)");
                    System.out.print("Choose Drink Type: ");
                    int drinkChoice = sc.nextInt();
                    
                    System.out.print("Enter Quantity: ");
                    int drinkQty = sc.nextInt();
                    
                    ColdDrinksCart drink = new ColdDrinksCart();
                    drink.chooseDrink(drinkChoice);
                    drink.setQuantity(drinkQty);

                    // for asking size

                    System.out.println("Which size do you want ? \n1. Small \n2. Medium \n3. Large");
                    int drinkSize = sc.nextInt();
                    drink.chooseSize(drinkSize);

                    // for ice or not
                    System.out.print("Add Ice ? (Press 1 for Yes, 2 for No): ");
                    int addIce = sc.nextInt();
                    if(addIce == 1) {
                        drink.addIce();
                    }
                    
                    System.out.println("\n--- Order Summary ---");
                    System.out.println("Drink: " + drink.getname());
                    System.out.println("Total for this item: " + drink.getTotalPrice());
                    
                    grandTotal = grandTotal + drink.getTotalPrice();
                    
                    break;
                    
                case 3:
                    System.out.println("\n--- Pizza Options ---");
                    System.out.println("1. Onion pizza (80)");
                    System.out.println("2. Tomato Pizza (70)");
                    System.out.println("3. Indi Tandoori pizza (250)");
                    System.out.println("4. Farm House Pizza (350)");
                    System.out.print("Choose Pizza Type: ");
                    int pizzaChoice = sc.nextInt();
                    
                    System.out.print("Enter Quantity: ");
                    int pizzaQty = sc.nextInt();
                    
                    PizzaCart pizza = new PizzaCart();
                    pizza.choosePizza(pizzaChoice);
                    pizza.setQuantity(pizzaQty);



                    System.out.println("Which size do you want ? \n1. Regular \n2. Medium \n3. Large");
                    int pizzaSize = sc.nextInt();
                    pizza.chooseSize(pizzaSize);

                    
                    
                    System.out.println("\n--- Order Summary ---");
                    System.out.println("Pizza: " + pizza.getname());
                    System.out.println("Total for this item: " + pizza.getTotalPrice());
                    
                    grandTotal = grandTotal + pizza.getTotalPrice();
                    
                    break;
                    
                case 4:
                    continueOrdering = false;
                    System.out.println("\n=== Thank You for Using Food Cart System ===");
                    System.out.println("Your Grand Total to pay is: " + grandTotal + " Rupees");

                    
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();

        System.out.println("how many times user choosed burger : " + BurgerCart.burgerCount);
        System.out.println("how many times user choosed pizza : " + PizzaCart.pizzaCount);
        System.out.println("how many times user choosed drinks : " + ColdDrinksCart.drinksCount);
    }
}
