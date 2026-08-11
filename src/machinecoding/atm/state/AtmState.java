package machinecoding.atm.state;

import machinecoding.atm.entities.AtmMachine;
import machinecoding.atm.enums.Operations;

public abstract class AtmState {
    
    public void insertCard(AtmMachine atmMachine) {
        throw new IllegalStateException("insert card not allowed");
    }

    public void enterPin(AtmMachine atmMachine, String pin) {
        throw new IllegalStateException("enter pin not allowed");
    }

    public void selectOperation(AtmMachine atmMachine, Operations operation) {
        throw new IllegalStateException("select operation not allowed");
    }

    public void withdrawCash(AtmMachine atmMachine, int amount) {
        throw new IllegalStateException("withdraw cash not allowed");
    }

    public void checkBalance(AtmMachine atmMachine) {
        throw new IllegalStateException("check balance not allowed");
    }

    public void cancel(AtmMachine atmMachine) {
        throw new IllegalStateException("cancel not allowed");
    }

    public void pinGeneration(AtmMachine atmMachine) {
        throw new IllegalStateException("pin generation not allowed");
    }
}
