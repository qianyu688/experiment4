package com.taxCalculator;

import javax.jws.WebService;

@WebService
public class TaxCalculator {
    public double calculateTax(double income) {
        double tax;
        if (income <= 5000) {
            tax = 0;
        } else if (income <= 8000) {
            tax = (income - 5000) * 0.1;
        } else {
            tax = (income - 8000) * 0.2 + (3000 * 0.1);
        }
        return tax;
    }
}
