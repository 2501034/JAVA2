public class Person {
    private String name;
    private String employeeID;

    public Person(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return String.format("%3s %7s", name, employeeID);
    }
}