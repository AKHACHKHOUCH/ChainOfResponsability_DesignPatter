package observable;

import java.util.Observable;

public class Budget extends Observable {
    private double budget;
    private double montantBloqué;

    public Budget() {
    }

    public void notifyObs(){
        setChanged();
        notifyObservers();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMontantBloqué() {
        return montantBloqué;
    }

    public void setMontantBloqué(double montantBloqué) {
        this.montantBloqué = montantBloqué;
    }
}
