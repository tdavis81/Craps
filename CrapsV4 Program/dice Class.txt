package crapsv4;
import java.util.Random;

public class dice 
{
    
    public int roll()
    {
        int ran = 0;
        Random r1 = new Random();
        ran = r1.nextInt(10001);
        int dice = 0;
        
        if ((0 <= ran) && ( ran < 278 ))
        {
            dice = 2;
        }
        else if (( 278 <= ran) && ( ran < 834 ))
        {
            dice = 3;
        }
        else if ((834 <= ran) && ( ran < 1667 ))
        {
           dice = 4;
        }
        else if (( 1667 <= ran) && ( ran < 2778 ))
        {
            dice = 5;
        }
        else if ((2778 <= ran) && ( ran < 4167))
        {
           dice = 6;
        }
        else if ((4167<= ran) && ( ran < 5834))
        {
            dice = 7;
        }
        else if ((5834 <= ran) && ( ran < 7223))
        {
            dice = 8;
        }
        else if ((7223 <= ran) && ( ran <8334))
        {
            dice = 9;
        }
        else if ((8334 <= ran) && ( ran < 9167))
        {
            dice = 10;
        }
        else if ((9167 <= ran) && ( ran < 9723))
        {
           dice = 11;
        }
        else if ((9723<= ran) && ( ran < 10001))
        {
           dice = 12;
        }
        
        return dice;
    }
    
}
