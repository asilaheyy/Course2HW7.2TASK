import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {

    public static Set<Passport> allPassports = new HashSet<>();

    private final int passportNum;

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final int birthDate;

    public Passport(String lastName, String firstName, String middleName, int birthDate, int passportNum) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.passportNum = passportNum;

    }

    public int getPassportNum() {
        return passportNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNum=" + passportNum +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNum == passport.passportNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNum);
    }

    }


