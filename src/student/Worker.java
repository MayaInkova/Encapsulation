package student;

public class Worker extends Human implements Comparable<Worker> {
    private double salary;
    private int hoursWorked;

    public Worker(String firstName, String lastName, double salary, int hoursWorked) {
        super(firstName, lastName);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateHourlyWage() {
        return salary / hoursWorked;
    }
    public int compareTo(Worker other) {
        // За сортиране в намаляващ ред, сравняваме заплатите обратно
        return Double.compare(other.salary, this.salary);
    }

    @Override
    public String toString() {
        return "Worker{firstName='" + getFirstName() + "', lastName='" + getLastName() + "', salary=" + salary + ", hoursWorked=" + hoursWorked + ", hourlyWage=" + calculateHourlyWage() + "}";
    }

}

