package HomeWorkLambda;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class EmployeeList {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new EmployeeBuilder().firstName("Robert")
                        .lastName("Lewandowski")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1988, 8,21))
                        .salary(5_000_000)
                        .companyName("Bayern Munchen")
                        .build(),
                new EmployeeBuilder().firstName("Martyna")
                        .lastName("Wojciechowska")
                        .gender(Gender.FEMALE)
                        .dateOfBirth(LocalDate.of(1980, 1,11))
                        .salary(49_563)
                        .companyName("NBP")
                        .build(),
                new EmployeeBuilder().firstName("Kamila")
                        .lastName("Sukiennik")
                        .gender(Gender.FEMALE)
                        .dateOfBirth(LocalDate.of(1988, 2,6))
                        .salary(42_760)
                        .companyName("NBP")
                        .build(),
                new EmployeeBuilder().firstName("Agnieszka")
                        .lastName("Radwańska")
                        .gender(Gender.FEMALE)
                        .salary(1_665_000)
                        .companyName("Działalność własna")
                        .build(),
                new EmployeeBuilder().firstName("Andrzej")
                        .lastName("Sapkowski")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1948, 6,21))
                        .salary(7000)
                        .companyName("Działalność własna")
                        .build(),
                new EmployeeBuilder().firstName("Samuel")
                        .lastName("Strażak")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1990, 4,30))
                        .salary(4_000)
                        .companyName("Państwowa Straż Pożarna")
                        .build(),
                new EmployeeBuilder().firstName("Robert")
                        .lastName("Budowniczy")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1995, 11,2))
                        .salary(2680)
                        .companyName("Budowlanka")
                        .build(),
                new EmployeeBuilder().firstName("Ambroży")
                        .lastName("Kleks")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1946, 5,1))
                        .salary(5500)
                        .companyName("Akademia Pana Kleksa")
                        .build(),
                new EmployeeBuilder().firstName("Janusz")
                        .lastName("Grom")
                        .gender(Gender.MALE)
                        .dateOfBirth(LocalDate.of(1999, 3,21))
                        .salary(2400)
                        .companyName("KFC")
                        .build(),
                new EmployeeBuilder().firstName("Anna")
                        .lastName("Pazura")
                        .gender(Gender.FEMALE)
                        .dateOfBirth(LocalDate.of(1970, 9,15))
                        .salary(2000)
                        .companyName("Urząd Miasta")
                        .build()
        );

    }
}
