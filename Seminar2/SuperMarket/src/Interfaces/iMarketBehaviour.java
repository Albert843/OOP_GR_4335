package Interfaces;
import Classes.Actor;
import java.util.List;

public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);
    public void releaseFromMarket(List<Actor> actors);
    void upDate();
}
