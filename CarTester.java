
import java.util.Scanner;

public class CarTester{
    public static Car addCar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the car's name: ");
        String carName = input.nextLine();
        
        System.out.print("\nPlease enter the car's miles: ");
        int carMiles = input.nextInt();
        
        System.out.print("\nPlease enter the car's gallons: ");
        int carGallons = input.nextInt();
        
        Car myCar = new Car(carMiles, carGallons ,carName);
        return myCar;
    }
    
    public static void main(String[] args){
        Car car1 = addCar();
        System.out.println(car1.toString());
        System.out.println("\n------NEXT CAR------------------------------------------\n");
        Car car2 = addCar();
        System.out.println(car2.toString());
    }
}
