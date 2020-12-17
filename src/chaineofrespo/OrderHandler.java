package chaineofrespo;
import observable.Budget;
import observers.Demande;

public abstract class OrderHandler {
    OrderHandler orderHandler;

    public void setNextHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public abstract void handleDemande(Demande demande, Budget budget);
}
