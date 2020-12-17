import chaineofrespo.OrderHandler;
import chaineofrespo.ServiceComptable;
import chaineofrespo.ServicePatrimoine;
import observable.Budget;
import observers.Demande;

public class Client {
    public static void main(String[] args) {
        Budget budget = new Budget();
        OrderHandler serviceComptable = new ServiceComptable();
        OrderHandler servicePatrimoine = new ServicePatrimoine();
        serviceComptable.setNextHandler(servicePatrimoine);
        Demande demande1 = new Demande();
        Demande demande2 = new Demande();
        budget.setBudget(10000);
        demande1.setMontantGlobale(1000);
        demande2.setMontantGlobale(3000);
        budget.addObserver(demande1);
        budget.addObserver(demande2);
        budget.notifyObs();
        serviceComptable.handleDemande(demande1, budget);
        serviceComptable.handleDemande(demande2, budget);
        budget.notifyObs();


    }
}
