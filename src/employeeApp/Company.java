package employeeApp;

public class Company {
    private static int maxId = 0;

    public final static double match401K = 0.05;

    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxId++;
        id = maxId;

        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Name: " + name + " debt: " + debt;
    }
}