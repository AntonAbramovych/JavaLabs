package lab4;

public class Employee {
    private String name;

    public Employee(String name, double... salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double[] getSalary() {
        return salary;
    }

    private double[] salary;

    public void calcSalary(String name, double... salary) {

        double totalSalary = 0;
        for (double a : salary) {
            totalSalary += a;
        }
        System.out.println("Employee name: " + name + " salary:" + totalSalary);
    }

}

class Accountant {
    public static void main(String[] args) {
        double salry[] = new double[]{500, 600, 400, 1000, 20};
        Employee employee = new Employee("Anton", salary);
        employee.calcSalary(employee.getName(), employee.getSalary());
    }
}