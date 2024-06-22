package com.solid.liskov.bad;

public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}
