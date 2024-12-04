package registry;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalc {
    private static int age;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static LocalDate currentDate = LocalDate.now();

    public static int calculate(String dateOfBirth) {
        LocalDate fDateOfBirth = LocalDate.parse(dateOfBirth, formatter);
        age = Period.between(fDateOfBirth, currentDate).getYears();
        return age;
    }
}