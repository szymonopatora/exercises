package HomeWorkLambda;

import java.util.Arrays;
import java.util.List;

import static HomeWorkLambda.EmployeeList.getEmployees;

/**
 * 2. Calculate salary average of a chosen company.
 */

public class HomeWorkTask2 {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.stream()
                .filter(x -> (x.getCompanyName().equals("NBP")))
                .map(Employee::getSalary)
            .forEach(System.out::println);
        //TODO
        //Sum the results and calculate the average

    }
}