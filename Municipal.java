import java.util.Scanner;
public class Municipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vechile number: ");
        int Vechilenumber = sc.nextInt();
        System.out.println("Waste Collected in Kilograms: ");
        double WasteCollectedinKilograms = sc.nextDouble();
        System.out.println("Number of Collection Points: ");
        int NumberofCollectionPoints = sc.nextInt();
        System.out.println("Vechile Status:");
        char VechileStatus = sc.next().charAt(0);
        System.out.println("Municipal Information");
        System.out.println("Vechile number: " + Vechilenumber);
        System.out.println("Waste Collected in Kilograms: " + WasteCollectedinKilograms + " Kilo grams ");
        System.out.println("NUmber of Collection Points: " + NumberofCollectionPoints);
        System.out.println("Vechile Status: " + VechileStatus);
    }

    
}
