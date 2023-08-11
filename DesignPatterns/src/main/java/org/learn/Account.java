package org.learn;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance > 0)
        this.balance = balance;
    }
}
