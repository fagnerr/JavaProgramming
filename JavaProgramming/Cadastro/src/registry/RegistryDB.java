package registry;

public class RegistryDB {
    private static int nextId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private int age;

    public RegistryDB(String firstName, String lastName, String gender, String dateOfBirth) {
        id = nextId ++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = AgeCalc.calculate(dateOfBirth);
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int newNextId) {
        nextId = newNextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String info = id + " - " + firstName + " " + lastName + " - Gênero: " + gender + " - Nascimento: " + dateOfBirth + " - " + age + " anos";
        return info;
    }
}