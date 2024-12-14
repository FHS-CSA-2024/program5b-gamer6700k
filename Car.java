
public class Car {
    private String carName; 
    private int mileDriven; 
    private int gallonsUsed; 
    
    Car() {
        mileDriven = 0; 
        gallonsUsed = 0; 
        carName = ""; 
        
    }
    
    Car(int mileDriven, int gallonsUsed, String carName) {
        mileDriven = 30; 
        gallonsUsed = 2; 
        carName = "camry";
    
    }
    
    public int getMiles() {
        return mileDriven; 
    }
    
    public int getGallons() {
        return gallonsUsed;
    }
    
    public String getName() {
        return carName; 
    }
    
    public void setMiles(int miles) {
        mileDriven = miles; 
    }
    public void setGallons(int gallons) {
        gallonsUsed = gallons; 
    }
    public void setName(String cName) {
        carName = cName; 
    }
    public double calculateAverage() {
        double avgMpg = mileDriven/gallonsUsed; 
        avgMpg = Math.round(avgMpg); 
    
        return avgMpg; 
    }
}
