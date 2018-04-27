package crapsv4;

public class Crapsv4 
{
   
    public static void printDirection()
    {
        //Start print Directions
        System.out.println("Programmed By: Tyler Davis");
        System.out.println("Date: 3/28/2018");
        System.out.println("Program: Craps Version 4");
        System.out.println("Hello and welcome to the game of Craps!, in this version you can bet on any roll!\n");
    }
    
    public static void setWallet()
    {
        //Variables and Objects
       double amount = 0.0;
       userWallet wallet = new userWallet();
       
       //Logic
       System.out.println("Please set your wallet amount below!");
       System.out.print("Wallet Amount: ");
       amount = SavitchIn.readLineInt();
       
        //Error checking to see if they enter a value under or = 0
        while (amount <=0.0) 
        {
            System.out.println("I'm sorry but you cannot set your wallet that low, try again!");
            System.out.print("Set Wallet Amount To: ");
            amount = SavitchIn.readLineInt();
            
        }
        
       wallet.setAmount(amount);
    }
    
    public static void setInitialBet()
    {
        //Variables and Objects
        double userBet = 0.0;
        userWallet wallet = new userWallet();
        
        //Logic
        System.out.println("Please place your bet below!");
        System.out.print("Bet: ");
        userBet = SavitchIn.readLineInt();
        
        //Error checking bet cant be higher than wallet amount cant be less than 0 
        while ((userBet <0.0) ||(userBet > wallet.getAmount()))
        {
            if (userBet<0.0)
            {
                System.out.println("I'm sorry you cannot place a bet less than 0,please try again!");
            }
            else if (userBet > wallet.getAmount())
            {
                System.out.println("I'm sorry you cannot place a bet higher than your wallet amount");
            }
            else 
            {
                System.out.println("Error in set Initial Bet");
            }
        
            System.out.println("Please place your bet below!");
            System.out.print("Bet: ");
            userBet = SavitchIn.readLineInt();
            
        }
        wallet.setBet(userBet);
    }
   
    public static void initialSideBet()
    {
        //Variables
        int sideBetDecison = 0;
        
        //Logic
        SideBet sideBet = new SideBet();
        System.out.println("Would you like to place a side bet on this roll?");
        System.out.println("Press 1 to place a sidebet || Press 2 to not place a sidebet!");
        System.out.print("Choice: ");
        sideBetDecison = SavitchIn.readLineInt(); 
        
        //Error checking if user enters anything other than 1 or 2
        while ((sideBetDecison!=1)&&(sideBetDecison!=2))
        {
            System.out.println("I'm sorry but that is an invalid choice please try again!");
            System.out.println("Press 1 to place a sidebet || Press 2 to not place a sidebet!");
            System.out.print("Choice: ");
            sideBetDecison = SavitchIn.readLineInt(); 
        }
        
        sideBet.setSideBetChoice(sideBetDecison);

    }
    
    public static void sideBetAmount()
    {
        //Variables and Objects
        int sideBetAmount = 0;
        double useableWalletAmount = 0.0;
        userWallet wallet = new userWallet();
        SideBet sideBet = new SideBet();
        
        if(sideBet.getSideBetChoice() == 1)
        {
            System.out.println("How much would you like to bet on this roll?");
            System.out.print("Side Bet Amount: ");
            sideBetAmount = SavitchIn.readLineInt();
            useableWalletAmount = (wallet.getAmount() - wallet.getBet());
            
            while ((sideBetAmount > useableWalletAmount) ||(sideBetAmount <0))
            {
                if (sideBetAmount > useableWalletAmount)
                {
                    System.out.println("I'm sorry you cannot place a side bet greater than your useable wallet amount!\n");
                }
                else if (sideBetAmount < 0)
                {
                    System.out.println("I'm sorry you cannot place a side bet amount less than zero try again\n");
                }
                else 
                {
                    System.out.println("Error in side bet amount \n");
                }
                
                System.out.println("How much would you like to bet on this roll?");
                System.out.print("Side Bet Amount: ");
                sideBetAmount = SavitchIn.readLineInt();
                
            }
            
            sideBet.setSideBetAmount(sideBetAmount);
        }
        else if (sideBet.getSideBetChoice() == 2)
        {
            sideBet.setSideBetAmount(0);
        }
        else 
        {
            System.out.println("Error");
        }
 
    }
    
    public static void sideBetValue()
    {
        System.out.println("");
        
        //Variables and Objects
        SideBet sideBet = new SideBet();
        int value = 0;
        
        //Logic
        if (sideBet.getSideBetChoice() == 1)
        {
            System.out.println("What value would you like to bet on?");
            System.out.print("Value : ");
            value = SavitchIn.readLineInt();
            
            while ((value >12) ||( value <=0))
            {
                System.out.println("I'm sorry that is not a valid value, please try again!");
                System.out.println("What value would you like to bet on?");
                System.out.print("Value : ");
                value = SavitchIn.readLineInt();
            }
            sideBet.setSideBetValue(value);
        }
        else if (sideBet.getSideBetChoice() == 2)
        {
            //If they dont choice to make a side bet this part is skipped
        }
        else 
        {
            System.out.println("Error in side bet value");
        }
        
    }
    
    public static void sideBetResults(int diceValue)
    {
        System.out.println("");
        
        //Variables and Objects
        SideBet sideBet = new SideBet();
        userWallet wallet = new userWallet();
        double dice2 = (35/1) * .9;
        double dice3 = (34/2) * .9;
        double dice4 = (33/3) * .9;
        double dice5 = (32/4) * .9;
        double dice6 = (31/5) * .9;
        double dice7 = (30/6) * .9;
        double dice8 = (31/5) * .9;
        double dice9 = (32/4) * .9;
        double dice10 = (33/3) * .9;
        double dice11 = (34/2) * .9;
        double dice12 = (35/1)   * .9;
        double total = 0.0;
        double newWallet = 0.0;
        
        if (diceValue ==2)
        {
            total = dice2;
        }
        else if (diceValue ==3)
        {
            total = dice3;
        }
        else if (diceValue ==4)
        {
            total = dice4;
        }
        else if (diceValue ==5)
        {
            total = dice5;
        }
        else if (diceValue ==6)
        {
            total = dice6;
        }
        else if (diceValue ==7)
        {
            total = dice7;
        }
        else if (diceValue ==8)
        {
            total = dice8;
        }
        else if (diceValue ==9)
        {
            total = dice9;
        }
        else if (diceValue ==10)
        {
            total = dice10;
        }
        else if (diceValue ==11)
        {
            total = dice11;
        }
        else if (diceValue ==12)
        {
            total = dice12;
        }
        
        if (sideBet.getSideBetChoice() ==1)
        {
            if (sideBet.getSideBetValue() == diceValue)
            {
                System.out.println("You have won on the side bet!");
                newWallet = ( wallet.getAmount() + (sideBet.getSideBetAmount()* total));
                wallet.setAmount(newWallet);
                
            }
            else if (sideBet.getSideBetValue() != diceValue)
            {
                System.out.println("You have lost on the side bet!");
                newWallet= ( wallet.getAmount() - sideBet.getSideBetAmount());
                wallet.setAmount(newWallet);
            }
            else
            {
                System.out.println("Error");
            }
        }
        else if (sideBet.getSideBetChoice() ==2)
        {
            //Do nothing 
        }
        else
        {
            System.out.println("Error in side bet results");
        }
     
    }
    public static void sideBetResults(int newRoll,int diceValue)
    {
         
        //Variables and Objects
        SideBet sideBet = new SideBet();
        userWallet wallet = new userWallet();
        double dice4 = (2/1) * sideBet.getSideBetAmount();
        double dice5 = (3/2) * sideBet.getSideBetAmount();
        double dice6 = (6/5) * sideBet.getSideBetAmount();
        double dice8 = (6/5) * sideBet.getSideBetAmount();
        double dice9 = (3/2) * sideBet.getSideBetAmount();
        double dice10 = (2/1) * sideBet.getSideBetAmount();
        
        double dice2 = (35/1) * 0.9;
        double dice3 = (34/2) * 0.9;
        double dice7 = (30/6) * 0.9;
        double dice11 = (34/2) * 0.9;
        double dice12 = (35/1) * 0.9;
        
        
        double total = 0.0;
        double newWallet = 0.0;
        
        if (newRoll ==4)
        {
            total = dice4;
        }
        else if (newRoll ==5)
        {
            total = dice5;
        }
        else if (newRoll ==6)
        {
            total = dice4;
        }
        else if (newRoll ==8)
        {
            total = dice5;
        }
        else if (newRoll ==9)
        {
            total = dice6;
        }
        else if (newRoll ==10)
        {
            total = dice10;
        }
        else if (newRoll ==2)
        {
            total = dice2;
        }
        else if (newRoll==3)
        {
            total = dice3;
        }
        else if (newRoll==7)
        {
            total = dice7;
        }
        else if (newRoll==11)
        {
            total = dice11;
        }
        else if (newRoll==12)
        {
            total = dice12;
        }
        
        
        if (sideBet.getSideBetChoice() ==1)
        {
            if (sideBet.getSideBetValue() == newRoll)
            {
                System.out.println("You have won on the side bet!");
                newWallet = ( wallet.getAmount() + (sideBet.getSideBetAmount()* total));
                wallet.setAmount(newWallet);
                
            }
            else if (sideBet.getSideBetValue() != diceValue)
            {
                System.out.println("You have lost on the side bet!");
                newWallet= ( wallet.getAmount() - sideBet.getSideBetAmount());
                wallet.setAmount(newWallet);
            }
            else
            {
                System.out.println("Error");
            }
        }
        else if (sideBet.getSideBetChoice() ==2)
        {
            //Do nothing 
        }
        else
        {
            System.out.println("Error in side bet results");
        }
    }
    
    public static void checkForWinner(int diceValue)
    {
        //Variables and objects
        userWallet wallet = new userWallet();
        dice diceRoll = new dice();
        double newWallet = 0.0;
        int newRoll = 0;
        
        System.out.println("");
        
        if ((diceValue == 7) || (diceValue ==11))
        {
            System.out.println("You rolled a " + diceValue + " You have won!");
            newWallet = (wallet.getAmount() + wallet.getBet());
            wallet.setAmount(newWallet);
        }
        else if ((diceValue == 2) || (diceValue ==3) || (diceValue ==12))
        {
            System.out.println("You rolled a " + diceValue + " You have Lost!");
            newWallet = (wallet.getAmount() - wallet.getBet());
            wallet.setAmount(newWallet);
        }
        else if ((diceValue ==4) ||(diceValue ==5) ||(diceValue ==6) ||(diceValue ==8) ||(diceValue ==9) ||(diceValue ==10))
        {
            System.out.println("You have gone on to the second round");
            System.out.println("Roll until you get a 7(which is a loss) or the same number you rolled the first time to win!");
           
            while((newRoll !=diceValue) && (newRoll !=7))
            {
                newRoll = diceRoll.roll();
                initialSideBet();
                sideBetAmount();
                sideBetValue();
                sideBetResults(newRoll,diceValue);
            
                if (newRoll == diceValue)
                {
                    System.out.println("You rolled a " + newRoll + " You have won!");
                    newWallet = (wallet.getAmount() + wallet.getBet());
                    wallet.setAmount(newWallet);
                }
                else if (newRoll ==7)
                {
                    System.out.println("You rolled a " + newRoll + " You have Lost!");
                    newWallet = (wallet.getAmount() - wallet.getBet());
                    wallet.setAmount(newWallet);
                }
                else if ((newRoll!=7) ||(newRoll!=diceValue))
                {
                    System.out.println("Roll Again");
                }
                else
                {
                    System.out.println("Error in while in check for winner");
                }
            }
        }
        else
        {
            System.out.println("Error in check for winner");
        }
    }
    
    public static void startCraps()
    {
        //Variables and Objects
        int playAgain = 0;
        int diceValue = 0;
        userWallet wallet = new userWallet();
        dice gameDiceValue = new dice();
        diceValue = gameDiceValue.roll();
        SideBet sideBet = new SideBet();
        
        System.out.println(diceValue);
        while((playAgain !=2) || (wallet.getAmount() ==0)) 
        {
            //Logic Process Order
            printDirection();
            setWallet();
            setInitialBet();
            //Stage 1 Side Bet 
            initialSideBet();
            sideBetAmount();
            sideBetValue();
            sideBetResults(diceValue);
            checkForWinner(diceValue);
            System.out.println("Would you like to play again? Press 1 for yes or 2 for no");
            System.out.print("Choice : ");
            playAgain = SavitchIn.readLineInt();
            
            while((playAgain !=1) &&(playAgain !=2))
            {
                System.out.println("I'm sorry those are not valid choices, try again!");
                System.out.print("Choice : ");
                playAgain = SavitchIn.readLineInt();
            }
           
        }
        System.out.println("You have left the game with " + wallet.getAmount() + " Dollars");
                
    }
    
    public static void main(String[] args) 
    {
        //Starts the Craps start method
       startCraps();
    }
    
}
