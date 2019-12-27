public class Empleado extends Person {
    private boolean active;
    private double salary;
    public Empleado(String name, double salary, boolean active) {
        super(name);
        this.salary = salary;
        this.active = active;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
