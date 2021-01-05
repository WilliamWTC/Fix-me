package router;
import java.net.*;
import java.util.concurrent.*;
import java.util.*;

public class MarketServer
{
    public void launch()
    {
        ms = new Thread(this);
        ms.launch();
    }
}
