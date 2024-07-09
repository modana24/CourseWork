import java.util.Objects;

public class Employee {

        private String fullName;
        private int departmentNumber;
        private double salary;

        private int id ;

// конструктор
public Employee(String fullName, int departmentNumber,double salary) {
    this.fullName = fullName;
    this.departmentNumber = departmentNumber;
    this.salary = salary;
    this.id = id ++;
}
//геттеры
public String getFullName() { return fullName; }
public int getDepartmentNumber() { return departmentNumber; }
public double getSalary() { return salary; }

//сеттеры
public void setSalary(double salary) { this.salary = salary; }
public void setDepartmentNumber(int departmentNumber) { this.departmentNumber = departmentNumber; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentNumber, salary);
    }


    public String etoString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}

