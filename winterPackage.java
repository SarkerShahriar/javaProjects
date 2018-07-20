package travelagency;

public class winterPackage extends Package
{
    public String season;
    
    public void WinterPackInfo(){
        PackageInfo();
        System.out.println("Journey Season [New Year or Xmas]:");
        String jSeason = input.nextLine();
        checkSeason(jSeason);
    }
    
    private void checkSeason(String Season){
        if(Season.equalsIgnoreCase("New Year") || Season.equalsIgnoreCase("Xmas"))
        {
            season = Season;
        }
        else
        {
            System.out.println("......Please Try Again.......");
            WinterPackInfo();
        }
    }
}
