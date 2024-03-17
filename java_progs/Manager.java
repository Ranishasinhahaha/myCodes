interface Payroll {
    double earnings(double basicSalary);

    double deductions(double basicSalary);

    double bonus(double basicSalary);
}

class Manager implements Payroll {
    @Override
    public double earnings(double basicSalary) {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }

    @Override
    public double deductions(double basicSalary) {
        return 0.12 * basicSalary;
    }

    // Bonus method not implemented
    @Override
    public double bonus(double basicSalary) {
        throw new UnsupportedOperationException("Bonus calculation not implemented for Manager");
    }
}

class Substaff extends Manager {
    @Override
    public double bonus(double basicSalary) {
        return 0.5 * basicSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        double basicSalary = 50000;
        Substaff substaff = new Substaff();
        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}