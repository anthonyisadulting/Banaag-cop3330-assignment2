package org.example.ex26.base;

public class PaymentCalculator {


    public String calculateMonthsUntilPaidOff(double bal, double aprcard, double monthpay){

        double dailyrate = aprcard/365;
        System.out.println(dailyrate); //checker

        double mp = monthpay/100;

        System.out.println(mp); //checker

        double divisor = -(0.03) * Math.log(1 + bal/mp * (1 - Math.pow(1+ dailyrate, 30.0)));
        System.out.println(divisor); //checker

        double dividend = Math.log(1 + dailyrate);
        System.out.println(dividend); //checker

        double resultdouble = divisor / dividend;

        String result = Double.toString(resultdouble);
        System.out.println(result); //checker

    return result;

    }



}
