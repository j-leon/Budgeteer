package com.jleon.budgeteer;

import java.math.BigDecimal;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Javier on 06/06/2016.
 */
public class BudgetEntry extends RealmObject {

    @PrimaryKey
    private int entryId;
    private String amountString;
    private boolean isIncome;
    @Ignore
    private BigDecimal amount;
    private String concept;

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getAmountString() {
        return amountString;
    }

    public void setAmountString() {
        this.amountString = this.amount.toString();
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
