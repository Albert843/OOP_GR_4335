package Classes;
public class AuctionClient extends Actor{
    protected String auctionName;
    private int idClient;
    protected  static int numberOnAuction;
    public int getIdClient(){
        return idClient;
    }
    public AuctionClient(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    @Override
    public Actor getActor() {
        return this;
    }
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

}
