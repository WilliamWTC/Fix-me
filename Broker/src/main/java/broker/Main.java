package broker;
import javax.swing.*;
import static java.lang.Integer.parseInt;
import java.io.*;
import java.net.Socket;

public class Main
{
    private static final int PORT;
    private static final String ADDRESS;
    String id;
    GrapeVine brokerMsg;
    String[] shares = { "S&P500", "NASDAQ"};

    JComboBox<String> equity = new JComboBox<>(shares);
    JFrame frame = new JFrame("EasyEquities");
    JButton btnBuy = new JButton("Buy");
    JButton btnSell = new JButton("Sell");
    JTextField Equity   = new JTextField(25);
    JTextField nshare = new JTextField(5);
    JTextArea messageArea = new JTextArea(5, 5);

    public Main()
    {
        txtEquity.setEditable(true);
        messageArea.setEditable(false);
        frame.getContentPane().add(equity, "North");
        frame.getContentPane().add(nshare, "Center");
        frame.getContentPane().add(new JScrollPane(messageArea), "South");
        frame.getContentPane().add(btnBuy, "West");
        frame.getContentPane().add(btnSell, "East");
        frame.pack();

        btnBuy.addActionListener( e -> {
            String message ="";
            message = "Id=" + this.id + "|"+ "Order-type=BUY|" + "Equity=" + ( String )equity.getSelectedItem()  + "|" +  "Shares=" + shares.getText() + "|";
            message = sign(message);
            out.println(message);
        });

        btnSell.addActionListener( e -> {
            String message ="";
            message = "Id=" + this.id + "|"+ "Order-type=SELL|" + "Equity=" + ( String )equity.getSelectedItem() + "|" +  "Shares=" + shares.getText() + "|";
            message = sign(message);
            out.println(message);
        });
    }
}