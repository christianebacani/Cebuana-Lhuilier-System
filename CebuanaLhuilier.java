// Cebuana Lhuilier System
// Created  by : Christiane A. Bacani
import java.util.Scanner;
public class CebuanaLhuilier {
    
    public static void moneyremitance(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sender`s name : ");
        String sender = input.nextLine();
        
        System.out.print("Receiver`s name : ");
        String receiver = input.nextLine();
        
        System.out.print("Relationship : ");
        String relationship = input.nextLine();
        
        System.out.print("Amount : ");
        int amount = input.nextInt();
        
        System.out.print("The total price is : " + (amount + 15));
        
        System.out.print("\n\nPlease wait for the control number---");
        
    }
    public static void pawning(){
        int price[] = {5600,6600,8600};
        String items[] = {"Necklace","Bracelet","Watch"};
        Scanner input = new Scanner(System.in);
        boolean order = true;
        
        int total = 0;
        while(order){
        System.out.print("AVAILABLE PAWN/S :\n");
        System.out.print("1.) Necklace\n2.) Bracelet\n3.) Watch\n4.) Exit\n");
        System.out.print("Enter choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 4:
                System.out.print("\n\nTHANK YOU, PLESAE COME AGAIN!");
                break;
        }
        
        System.out.print("Enter the quantity : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1] * quantity;
        
        System.out.print("\nDo you want to pawn more? (y/n) :  ");
        input.nextLine();
        String orderAgain = input.nextLine();
        
        if(orderAgain.equalsIgnoreCase("n")){
            order = false;
            System.out.print("\nThe total price for your " + items[choice - 1] + " is : P " + total + "\n");
            
            System.out.print("\n\nWait for the money in the claiming section---");
        }
        
        
    }
        
    }
    
    public static void eload(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        String number = input.nextLine();
        
        System.out.print("\n\nPlesae wait for the confirmation of your load in your device!");
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Cebuana Lhulier!\n");
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Money Remitance\n2.) Pawning\n3.) E-Load\n4.) Exit\n");
        System.out.print("Enter  your choice here : ");
        String choice = input.nextLine();
        
        switch(choice){
            case "1":
                moneyremitance();
                break;
                
            case "2":
                pawning();
                break;
            
            case "3":
                eload();
                break;
                
            case "4":
                System.out.print("\n\nTHANK YOU, PLESAE COME AGAIN!");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!");
        }
    }
}
