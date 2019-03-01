package HomeWorkLambda;


import java.util.List;
import java.util.stream.Collectors;

import static HomeWorkLambda.EmployeeList.getEmployees;

public class HomeWorkTask6 {

    /**
     * 6. Generate the list of the employees with an 10% salary increase.
     */

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.stream()
                .map(Employee::getSalary)
                .map(x->(x+(x*0.10)))
                .forEach(System.out::println);
        //TODO
        //change from getSalary() to Employee

    }


}

