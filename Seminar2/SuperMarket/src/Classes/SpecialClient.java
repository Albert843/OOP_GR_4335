package Classes;
public class SpecialClient extends Actor{
    private int idVIP;
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }
    public int getId(){
        return idVIP;
    }
    @Override
    public String getName() {
        return super.name;
    }
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    public void setTakeOrder(boolean takeOrder){
        super.isTakeOrder = takeOrder;
    }
    public void setMakeOrder(boolean pickUpOrder){
        super.isMakeOrder = pickUpOrder;
    }
    public Actor getActor(){
        return this;
    }
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
}
