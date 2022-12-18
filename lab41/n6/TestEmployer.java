package ru.mirea.lab41.n6;

public class TestEmployer {
    public static void main(String[] args) {
        Employer[] emps = new Employer[5];
        emps[0] = new Manager("vasya", "pushkin", 123455, 1234);
        emps[1] = new Employer("sasha", "ivanov", 32145);
        emps[2] = new Manager("tom", "hollms", 56894, 3552);
        emps[3] = new Employer("ivan", "kolyma", 12533);
        emps[4] = new Employer("sherlok", "smirnov", 78945);

        for(Employer emp : emps) {
            System.out.println(emp.getIncome());
        }
    }
}
