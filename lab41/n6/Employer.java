package ru.mirea.lab41.n6;

public class Employer {
    private String firstName;
    private String lastName;
    private int income;

    public Employer() {}

    public Employer(String firstName, String lastName, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }
}
