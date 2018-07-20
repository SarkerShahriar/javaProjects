package travelagency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("......Travelers Information.........");
        System.out.println("How many Travelers:");
        int traveler=input.nextInt();
        input.nextLine();
        Traveler t[] = new Traveler[traveler];
        for(int i=0;i<traveler;i++)
        {
            t[i] = new Traveler();
            t[i].TravelerInfo();
        }
        
        System.out.println(".......Package Information......");
        System.out.println(".........Summer.........");
        System.out.println("How many Summer Packages:");
        int summerPack = input.nextInt();
        input.nextLine();
        SummerPack sp[] = new SummerPack[summerPack];
        for(int j=0;j<summerPack;j++)
        {
            sp[j] = new SummerPack();
            sp[j].SummerPackInfo();
        }
        
        System.out.println(".......Winter........");
        System.out.println("How many winter packages:");
        int winterPack = input.nextInt();
        input.nextLine();
        winterPackage wp[] = new winterPackage[winterPack];
        for(int k=0;k<winterPack;k++)
        {
            wp[k] = new winterPackage();
            wp[k].WinterPackInfo();
        }
        
        System.out.println("........Package Available........");
        System.out.println("___Summer Packages___");
        for(int j=0;j<summerPack;j++)
        {
            System.out.println("Package ID:"+sp[j].getSPackID()+"   Package Name:"+sp[j].getSPackName());
            System.out.println("Package Price per Person:"+sp[j].getSPackPrice());
            System.out.println("Seat available:"+sp[j].getSPackSeatCapacity());
        }
        
        System.out.println("___Winter Package___");
        for(int k=0;k<winterPack;k++)
        {
            System.out.println("Package ID:"+wp[k].getSPackID()+"   Package Name:"+wp[k].getSPackName());
            System.out.println("Package Price per Person:"+wp[k].getSPackPrice());
            System.out.println("Seat available:"+wp[k].getSPackSeatCapacity());
        }
        
        System.out.println("________Buy Packages__________");
        System.out.println("Which Package you want [Summer or Winter]");
        String packageType = input.nextLine();
        double Total_price=0.0;
        if(packageType.equalsIgnoreCase("Summer"))
        {
            for(int j=0;j<summerPack;j++)
            {
                System.out.println("Package ID:"+sp[j].getSPackID()+"   Package Name:"+sp[j].getSPackName());
                System.out.println("Package Price per Person:"+sp[j].getSPackPrice());
                System.out.println("Seat available:"+sp[j].getSPackSeatCapacity());
            }
            
            boolean runTime = true;
            int j=0;
            
            while(runTime)
            {
                System.out.println("Enter Package id:");
                String package_id = input.nextLine();
                System.out.println("How many travelers:");
                int tra = input.nextInt();
                input.nextLine();
                boolean check= true;
                while(check)
                {
                    if(sp[j].getSPackID().equalsIgnoreCase(package_id))
                    {
                       if(sp[j].checkSeatAvailability(tra))
                       {
                           sp[j].setSeatCapasity(tra);
                           Total_price = Total_price+sp[j].getSPackPrice()*tra;
                       }
                       check = false;
                    }
                    j++;
                }
                System.out.println("Do you want to Continue [Y/N] :");
                String decision = input.nextLine();
                runTime = decision.equalsIgnoreCase("Y");
                if(runTime)
                {
                    for(j=0;j<summerPack;j++)
                    {
                        System.out.println("Package ID:"+sp[j].getSPackID()+"   Package Name:"+sp[j].getSPackName());
                        System.out.println("Package Price per Person:"+sp[j].getSPackPrice());
                        System.out.println("Seat available:"+sp[j].getSPackSeatCapacity());
                    }
                }
                j=0;
            }
            System.out.println("Enter your ID number:");
            String trav_id = input.nextLine();
            int i=0;
            boolean checkid = true;
            
            while(checkid)
            {
                if(trav_id.equalsIgnoreCase(t[i].getTravelerID()))
                {
                    if(t[i].checkTraverlerType("Registered"))
                    {
                        Total_price = Total_price - t[i].checkDiscount(Total_price);
                        System.out.println("Your Bill is :"+Total_price);
                    }
                    else
                    {
                        System.out.println("Your Bill is :"+Total_price);
                    }
                }
                checkid = false;
            }
        }
        else
        {
            for(int k=0;k<winterPack;k++)
            {
               System.out.println("Package ID:"+wp[k].getSPackID()+"   Package Name:"+wp[k].getSPackName());
               System.out.println("Package Price per Person:"+wp[k].getSPackPrice());
               System.out.println("Seat available:"+wp[k].getSPackSeatCapacity());
            }
            
            boolean runTime = true;
            int j=0;
            
            while(runTime)
            {
                System.out.println("Enter Package id:");
                String package_id = input.nextLine();
                System.out.println("How many travelers:");
                int tra = input.nextInt();
                input.nextLine();
                boolean check= true;
                while(check)
                {
                    if(wp[j].getSPackID().equalsIgnoreCase(package_id))
                    {
                       if(wp[j].checkSeatAvailability(tra))
                       {
                           wp[j].setSeatCapasity(tra);
                           Total_price = Total_price+wp[j].getSPackPrice()*tra;
                       }
                       check = false;
                    }
                    j++;
                }
                System.out.println("Do you want to Continue [Y/N] :");
                String decision = input.nextLine();
                runTime = decision.equalsIgnoreCase("Y");
                if(runTime)
                {
                    for(int k=0;k<winterPack;k++)
                    {
                        System.out.println("Package ID:"+wp[k].getSPackID()+"   Package Name:"+wp[k].getSPackName());
                        System.out.println("Package Price per Person:"+wp[k].getSPackPrice());
                        System.out.println("Seat available:"+wp[k].getSPackSeatCapacity());
                    }
                }
                j=0;
            }
            System.out.println("Enter your ID number:");
            String trav_id = input.nextLine();
            int i=0;
            boolean checkid = true;
            
            while(checkid)
            {
                if(trav_id.equalsIgnoreCase(t[i].getTravelerID()))
                {
                    if(t[i].checkTraverlerType("Registered"))
                    {
                        Total_price = Total_price - t[i].checkDiscount(Total_price);
                        System.out.println("Your Bill is :"+Total_price);
                    }
                    else
                    {
                        System.out.println("Your Bill is :"+Total_price);
                    }
                    checkid = false;
                }
           }
       }
    }
}
