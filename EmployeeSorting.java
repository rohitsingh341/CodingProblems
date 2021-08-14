package CodingExercises;

import java.util.*;

// Write a program to sort employees
// in descending order based on their salary if those who are having same salary then sort based on their age.
public class EmployeeSorting {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rohit", 33, 90);
        Employee e2 = new Employee("Ramesh", 38, 100);
        Employee e3 = new Employee("Rohan", 29, 100);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Collections.sort(employees);
        System.out.println("Sorted employees : " + employees);

    }
}

class Employee implements Comparable{
    private String name;
    private int age;
    private Double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        int salComparison = e.getSalary().compareTo(this.getSalary());
        if (salComparison == 0) {
            return Integer.compare(e.getAge(), age);
        }
        return salComparison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
