package HomeWorkLambda;


import java.util.Comparator;
import java.util.List;

import static HomeWorkLambda.EmployeeList.getEmployees;

public class HomeWorkTask4 {

    /**
     * 4. Check in which company works the best earning employee.
     */

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.stream()
                .sorted((a,b) -> a.getSalary())
                .max((a,b)->a.getSalary()-b.getSalary())
                .map(a->a.getCompanyName())
                .ifPresent(System.out::println);

        //Done!! :)
    }

}

