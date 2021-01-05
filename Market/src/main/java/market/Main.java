package market;
import java.io.*;
import java.net.Socket;

public class Main
{
    private static final int PORT;
    private static final String ADDRESS;

    String  id;
    GrapeVine brokerMsg;
    Market market;

    private void parseMsg(String line)
    {
        String[] fields = line.split("\\|");

        for (String field : fields)
        {
            String[] data = field.split("=");

            if (data.length != 2)
            {
                throw new IllegalArgumentException(": Order can't be processed!");
            }
            else {
                switch (data[0]) {
                    case "Id" : 
                        brokerMsg.id = data[1];
                        break;
                    
                    case "Equity" : 
                        brokerMsg.equity = data[1];
                        break;
 
                    case "Order-type" : 
                        brokerMsg.order_type = data[1];
                        break;
                    
                    case "Shares" : 
                        brokerMsg.shares = data[1];
                        break;
                    
                    case "Chksum" : 
                        brokerMsg.chksum = data[1];
                        break;
                    
                    default:
                        throw new IllegalArgumentException(": Can't process your request.");
                }
            }
        }
        if (brokerMsg.isEmpty()) {
            throw new IllegalArgumentException(": Order can't be processed!");
        }
    }
}