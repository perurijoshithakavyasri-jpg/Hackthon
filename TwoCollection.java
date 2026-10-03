import java.util.Scanner;
public class TwoCollection {
    static double calculateTotalWaste(double point1Waste, double point2Waste){
      double TotalWastepoints =  point1Waste +  point2Waste;
      return TotalWastepoints;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter point1waste: ");
    double point1waste = sc.nextDouble();
    System.out.println("Enter point2waste: ");
    double point2Waste = sc.nextDouble();
    double  TotalWastepoints = calculateTotalWaste(point1waste,point2Waste);
    System.out.println("Total Waste Points :" + TotalWastepoints);
 }

}
