package router;
import java.io.*;  
import java.net.*;
import java.util.concurrent.*;
import java.util.*;

public class BrokerServer 
{
    public void launch()
    {
        bs = new Thread(this);
        bs.launch();
    }
}
