package chaineofrespo;

import observable.Budget;
import observers.Demande;

public class ServicePatrimoine extends OrderHandler {
    @Override
    public void handleDemande(Demande demande, Budget budget) {
        budget.setBudget(budget.getBudget()-budget.getMontantBloqué());
        budget.setMontantBloqué(0);
        System.out.println("l'opération est terminée : budget : "+ budget.getBudget()+"DH, montant bloqué : "+budget.getMontantBloqué()+"DH");
    }
}
