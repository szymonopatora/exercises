package HomeWorkLambda;


import java.util.List;

import static HomeWorkLambda.EmployeeList.getEmployees;

public class HomeWorkTask3 {

    /**
     * 3. Calculate how much earn all the women from the list.
     */

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        System.out.println(employees.stream()
                .filter(x -> x.getGender().equals(Gender.FEMALE))
                .mapToInt(x->x.getSalary())
                .sum()
        );
    }


}

