package market;

public class GrapeVine
{
    public String   id,order_type,equity,shares,chksum;

    @Override
    public String toString()
    {
        return ( id + " " + order_type  + " " +  equity  + " " +  shares  + " " + chksum );
    }
    boolean isEmpty()
    {
        return ( id == null  || order_type == null  || equity == null || shares == null || chksum == null);
    }
}