package travelagency;

import java.util.Scanner;

public class Traveler 
{
    public String t_id;
    public String t_name;
    public String t_type;
    Scanner input = new Scanner(System.in);
    
    public void TravelerInfo(){
        System.out.println("Traveler Name:");
        t_name = input.nextLine();
        System.out.println("Traveler ID:");
        t_id = input.nextLine();
        System.out.println("Traveler Type:");
        t_type = input.nextLine();
    }
    
    public String getTravelerID(){
        return t_id;
    }
    
    public boolean  checkTraverlerType(String tType){
        return tType.equalsIgnoreCase("Registered");
    }
    
    public double checkDiscount(double dis){
        return dis*.1;
    }
}
