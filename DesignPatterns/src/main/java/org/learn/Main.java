package org.learn;

public class Main {
    public static void main(String[] args) {
//        User user = new User("Ariany", 32);
//        user.sayHello();
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}