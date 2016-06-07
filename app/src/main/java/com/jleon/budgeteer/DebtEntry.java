package com.jleon.budgeteer;

import java.math.BigDecimal;
import java.util.Date;

import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Javier on 06/06/2016.
 */
public class DebtEntry {
    @PrimaryKey
    private int debtId;
    @Ignore
    private BigDecimal amount;
    private String amountString;
    @Ignore
    private BigDecimal paymentAmount;
    private String paymentAmountString;
    private Date addedOn;
    private int remainingPayments;

    public int getDebtId() {
        return debtId;
    }

    public void setDebtId(int debtId) {
        this.debtId = debtId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountString() {
        return amountString;
    }

    public void setAmountString() {
        this.amountString = this.amount.toString();
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentAmountString() {
        return paymentAmountString;
    }

    public void setPaymentAmountString() {
        this.paymentAmountString = this.paymentAmount.toString();
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public int getRemainingPayments() {
        return remainingPayments;
    }

    public void setRemainingPayments(int remainingPayments) {
        this.remainingPayments = remainingPayments;
    }
}
