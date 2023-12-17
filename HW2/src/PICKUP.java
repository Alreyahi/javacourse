public class PICKUP extends types{
    Integer price;
    public void createTrade()
    {
        TradeType type1 = TradeType.PICKUP;

    }
    public PICKUP(Integer price1)
    {
        createTrade();
        this.price=price1;
    }

}
