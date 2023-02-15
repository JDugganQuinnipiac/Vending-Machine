import java.util.Scanner;

public class VendingMachine 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        //Variable Prices
        double cookiesPrice = 1.50;
        double doritosPrice = 2.50;
        double waterPrice = 1.25;
        double mentosPrice = 0.75;
        double almondJoysPrice = 1.25;
        double mAndMsPrice = 1.00;
        double skittlesPrice = 1.00;
        double sunchipsPrice = 1.50;
        double laysPrice = 0.75;

        //Welcom Message and Input
        System.out.println("Welcome, please enter corresponding number for item wanted:\n 1.Cookies($1.50) 2.Doritos($2.50) 3.Water($1.25) 4.Mentos($0.75) 5.AlmondJoys($1.25)\n 6.M&Ms($1.00) 7.Skittles($1.00) 8.Sunchips($1.50) 9.Lays($0.75): ");
        int check = scan.nextInt();

        //Prompt user to enter money amount
        System.out.println("Please insert the amount of money you are paying. Only $1 bills are accepted");
        int payment = scan.nextInt();


        //Change for each purchase
        double change = 0;
        
        //Transactions
        if(check == 1){
            if(payment < 1.5){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - cookiesPrice;
            }
        }else if(check == 2){
            if(payment < 2.5){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - doritosPrice;
            }

        }else if(check == 3){
            if(payment < 1.25){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - waterPrice;
            }

        }else if(check == 4){
            if(payment < 0.75){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - mentosPrice;
            }

        }else if(check == 5){
            if(payment < 1.25){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - almondJoysPrice;
            }

        }else if(check == 6){
            if(payment < 1){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - mAndMsPrice;
            }

        }else if(check == 7){
            if(payment < 1){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - skittlesPrice;
            }

        }else if(check == 8){
            if(payment < 1.5){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - sunchipsPrice;
            }

        }else if(check == 9){
            if(payment < 0.75){
                System.out.println("Sorry not enough money was entered. Your money will be given back. Please try again");
                change = payment;
            }else{
                change = payment - laysPrice;
            }
        }else{
            System.out.println("Sorry, invalid selection. Please try again");
            change = payment;
        }
        
        //Confirming transaction and Departure Message
        System.out.println("Do you want to cancel this transaction? Yes or No: ");
        String confirm = scan.next();
        if(confirm.equalsIgnoreCase("Yes"))
        {
            System.out.println("Your change is $" + payment + " Have a nice day");

        }
        else if(confirm.equalsIgnoreCase("No"))
        {
            System.out.println("Your change is $" + change);
            System.out.println("I hope you enjoy your snack!");
        }
        else
        {
            System.out.println("Error has occurred");
            System.out.println("Your change is $" + payment + " please try again.");
        }

    }
}
