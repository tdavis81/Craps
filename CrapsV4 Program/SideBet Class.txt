package crapsv4;

public class SideBet 
{
    public static int sideBetDecison = 0;
    public static int sideBetAmount = 0;
    public static int sideBetValue = 0;
    
    public int getSideBetChoice()
    {
        return sideBetDecison;
    }
    
    
    public void setSideBetChoice(int sideBetDecison)
    {
        if (sideBetDecison ==1)
        {
            System.out.println("");
            System.out.println("You have chosen to place a sidebet!");
            this.sideBetDecison = sideBetDecison;
        }
        else if (sideBetDecison ==2)
        {
            System.out.println("");
            System.out.println("You have chosen to not place a sidebet!");
            this.sideBetDecison = sideBetDecison;
        }
        else
        {
            System.out.println("Error");
        }
    }
    public int getSideBetAmount()
    {
        return sideBetAmount;
    }
    public void setSideBetAmount(int sideBetAmount)
    {
        this.sideBetAmount = sideBetAmount;
    }
    
    public int getSideBetValue()
    {
        return sideBetValue;
    }
    public void setSideBetValue(int sideBetValue)
    {
        this.sideBetValue = sideBetValue;
    }
    
}


  