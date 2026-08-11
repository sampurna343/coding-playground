package machinecoding.atm.entities;

import machinecoding.atm.enums.Operations;
import machinecoding.atm.state.AtmState;
import machinecoding.atm.state.IdleState;

public class AtmMachine {
    private AtmState atmState;
    private int atmFund;

    public AtmMachine(int atmFund) {
        this.atmFund = atmFund;
        this.atmState = new IdleState();
    }

    public int getAtmFund() {
        return atmFund;
    }

    public void setAtmFund(int amount) {
        this.atmFund = amount;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public void insertCard() {
        atmState.insertCard(this);
    }

    public void enterPin(String pin) {
        atmState.enterPin(this, pin);
    }

    public void selectOperation(Operations operation) {
        atmState.selectOperation(this, operation);
    }

    public void withdrawCash(int amount) {
        atmState.withdrawCash(this, amount);
    }

    public void checkBalance() {
        atmState.checkBalance(this);
    }

    public void cancel() {
        atmState.cancel(this);
    }

    public void pinGeneration() {
        atmState.pinGeneration(this);
    }

}
