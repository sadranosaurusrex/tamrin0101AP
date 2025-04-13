package models;
/*
Explanation:
- when we create an expense, we need to store some information about it.
- Expense is something that we need to make it an object.
- put those information here and use them in your code.
*/

import models.enums.Currency;

public class Expense {
    long price;
    User user;
    Currency currency;

    public Expense(long price, User user, Currency currency) {
        this.price = price;
        this.user = user;
        this.currency = currency;
        currency.getValue();
    }


}
