package HomeWorkLambda;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static HomeWorkLambda.EmployeeList.getEmployees;

public class HomeWorkTask5 {

    /**
     * 5. Create the list of the employees, sorted by age, who are 30 or less years old.
     */

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.stream()
                .filter(x -> x.getDateOfBirth().plusYears(30).isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(Employee::getSalary))
                //.filter(x-> LocalDate.now().getYear() - x.getDateOfBirth().getYear() <=30)
                //.sorted((a, b) -> b.getDateOfBirth().getYear() - a.getDateOfBirth().getYear())
                .forEach(System.out::println);
        //TODO
        //a lot ;)

    }


}

