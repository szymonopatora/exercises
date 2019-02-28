package HomeWorkLambda;

import java.time.LocalDate;
import java.util.Optional;

public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private int salary;
    private String companyName;

    public EmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public EmployeeBuilder salary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder companyName (String companyName) {
        this.companyName=companyName;
        return this;
    }
    public Employee build() {
        return new Employee(Optional.ofNullable(firstName).orElse("Unknown"),
                Optional.ofNullable(lastName).orElse("Unknown"),
                Optional.ofNullable(gender).orElse(Gender.UNKNOWN),
                dateOfBirth, salary,
                Optional.ofNullable(companyName).orElse("Unknown"));
    }
}
