package chaineofrespo;

import observable.Budget;
import observers.Demande;

public class ServiceComptable extends OrderHandler {
    @Override
    public void handleDemande(Demande demande, Budget budget){
        if(demande.getMontantGlobale() <= budget.getBudget()){
            System.out.println("l'opération est en cours ...");
            budget.setMontantBloqué(demande.getMontantGlobale());
            System.out.println("le montant bloqué est : "+budget.getMontantBloqué());
            orderHandler.handleDemande(demande, budget);
        }
        else{
            System.out.println("le budget n'est pas suffisant pour efféctuer l'opération");
        }
    }
}
