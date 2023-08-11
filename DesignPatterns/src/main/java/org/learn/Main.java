package org.learn;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.setBalance(1);
        System.out.println(account.getBalance());

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}