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
        double MandMsPrice = 1.00;
        double skittlesPrice = 1.00;
        double sunchipsPrice = 1.50;
        double laysPrice = 0.75;

        //Welcom Message and Input
        System.out.println("Welcome, please enter corresponding number for item wanted:\n 1.Cookies($1.50) 2.Doritos($2.50) 3.Water($1.25) 4.Mentos($0.75) 5.AlmondJoys($1.25)\n 6.M&Ms($1.00) 7.Skittles($1.00) 8.Sunchips($1.50) 9.Lays($0.75): ");
        int check = scan.nextInt();
    }
}
