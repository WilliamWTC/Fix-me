package market;
import java.util.ArrayList;

public class Market
{
    ArrayList<Pointer> stock;
    {
        stock = new ArrayList<>();
        stock.add(new Index(100, "NASDAQ"));
        stock.add(new Index(100, "S&P500"));
    }

    String buy(String etf, int shares)
    {
        for (Pointer i : stock)
        {
            if (i.pointer.equalsIgnoreCase(etf))
            {
                if (i.shares >= shares)
                {
                    i.shares -= shares;
                    return "Shares bought successfully! ";
                }
            }
        }
        return "Your buy instruction can't be processed!";
    }

    String sell(String etf, int shares)
    {
        for (Pointer i : stock)
        {
            if (i.pointer.equalsIgnoreCase(etf) && shares + i.shares <= 100)
            {
                i.shares += shares;
                return "Shares sold successfully! ";
            }
        }
        return "Your sell instruction was not approved!";
    }    
}
