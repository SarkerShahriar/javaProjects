package travelagency;

import java.util.Scanner;

public class Package 
{
    
    private String packageId;
    private String packageName;
    private double packagePrice;
    private int MaxseatCapasity=10;
    Scanner input = new Scanner(System.in);
    
    public void PackageInfo(){
        System.out.println("Package ID:");
        packageId = input.nextLine();
        System.out.println("Package Name:");
        packageName = input.nextLine();
        System.out.println("Package price per person:");
        packagePrice = input.nextDouble();
        input.nextLine();
    }
    
    public void setSeatCapasity(int avialableSeat){
        MaxseatCapasity = MaxseatCapasity-avialableSeat;
    }
    
    public boolean checkSeatAvailability(int seat){
        if(seat<MaxseatCapasity)
        {
            return true;
        }
        else
        {
            System.out.println("Seat is not available");
            return false;
        }
    }
    
    public String getSPackID(){
        return packageId;
    }
    
    public String getSPackName(){
        return packageName;
    }
    
    public double getSPackPrice(){
        return packagePrice;
    }
    
    public int getSPackSeatCapacity(){
        return MaxseatCapasity;
    }
}
