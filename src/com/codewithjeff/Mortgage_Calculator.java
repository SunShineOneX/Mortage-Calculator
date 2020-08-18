package com.codewithjeff;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Principal: ");
        int principal = in.nextInt();

        System.out.print("Annual Interest Rate: ");
        double apr = in.nextDouble() / 100 / 12;
        System.out.println(apr);

        System.out.print("Period (Years): ");
        int period = in.nextInt() * 12;
        System.out.println(period);

        double mortgage = principal
                * (apr * Math.pow(1 + apr, period))
                / (Math.pow(1 + apr,period)-1);
        System.out.println(mortgage);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + result);

    }
}
