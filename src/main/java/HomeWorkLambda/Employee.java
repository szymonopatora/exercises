package HomeWorkLambda;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private int salary;
    private String companyName;

    public Employee(String firstName, String lastName, Gender gender, LocalDate dateOfBirth, int salary, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.companyName=companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                gender == employee.gender &&
                Objects.equals(dateOfBirth, employee.dateOfBirth) &&
                Objects.equals(companyName, employee.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, dateOfBirth, salary, companyName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}


