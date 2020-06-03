package employeeApp;

public class Main {
    private static void workWithData() {
        System.out.println("Welcome to Lambda School's Java!!!");
        HealthPlan h1 = new HealthPlan("My Health 1");
        HealthPlan h2 = new HealthPlan("My Health 2");
        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);
        
        // (String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId) 
        Employee emp1 = new Employee("Steve", "Rogers", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("Margaret", "Carter", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("James", "Barnes", 75000, true, c2.id, h2.getId());
        Employee emp4 = new Employee("Sammuel", "Wilson", 120000, true, c2.id, h1.getId());
        Employee emp5 = new Employee("Howard", "Stark", 45000, true, c2.id, h1.getId());

        System.out.println("*** Query Data");
        System.out.println(c1.toString());
        System.out.println(c1);
        System.out.println();
        System.out.println("Original: " + c1.debt);
        c1.debt = -c1.debt;
        c1.debt = -c1.debt;

        System.out.println("\n*** Working with Numbers");
        System.out.println("divide 5 " + (c1.debt / 5));
        System.out.println("mod 2" + (c1.debt % 2));
        int theAns = c1.debt / 7;
        System.out.println("divide 7 " + theAns);
        double theAns2 = c1.debt / 7.0;
        System.out.println("divide 7 double " + theAns2);
        double theAns = (double) c1.debt / 7;
        System.out.println("divide 7 double conversion " + theAns);
    }
    public static void main(String[] args) {
        workWithData();
    }
}