import Classes.*;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class Main {
    public static void main(String[] args) throws Exception{
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("President", 1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());

        market.acceptToMarket(new AuctionClient("AuctionClient"));

        market.upDate();
    }
}