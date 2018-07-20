package travelagency;

public class SummerPack extends Package
{
    public String month;
    
    public void SummerPackInfo(){
        PackageInfo();
        System.out.println("Journey Month [January or June]:");
        String jmonth  = input.nextLine();
        checkMonth(jmonth);
    }
    
    private void checkMonth(String Month){
        if(Month.equalsIgnoreCase("january") || Month.equalsIgnoreCase("june"))
        {
            month=Month;
        }
        else
        {
            System.out.println("......Please Try Again.......");
            SummerPackInfo();
        }
    }
}
