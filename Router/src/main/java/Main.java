package src.main.java;
import router.*;
import java.io.*;  
import java.net.*;
import java.util.concurrent.*;
import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        BrokerServer bs = new BrokerServer();
        MarketServer ms = new MarketServer();
        
        System.out.println("Router starting...");
        bs.start();
        ms.start();
        System.out.println("Active on ports 5000 & 5001... \n");
    }
}