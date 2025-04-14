package models;

/*
Explanation:
- User is definitely an object in our app.
- put the information that you need to store about the user here.
- you can put some functions here to manage the user data too.
 */

import java.util.ArrayList;

public class User {
    String name;
    String username = new String();
    String password = new String();
    String email = new String();
    ArrayList<Expense> expenses = new ArrayList<>();
    Group lastGroup = null;

    public User(String username, String password, String email, String name, Group lastGroup) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void addExpense(Expense expense) {
        for (Expense exp : expenses) {
            if(exp.user == expense.user) {
                exp.price += expense.price;
                return;
            }
        }
        expenses.add(expense);
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
