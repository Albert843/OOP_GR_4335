package Interfaces;
import Classes.Actor;

public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor);
    public void releaseFromQueue();
    public void giveOrder();
    public void takeOrder();

}
