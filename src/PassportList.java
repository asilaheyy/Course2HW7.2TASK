import java.util.HashSet;
import java.util.Set;

public class PassportList {


    private static final Set<Passport> passports = new HashSet<>();


    public void addUpdatePassport(Passport passport) {
        this.passports.add(passport);
    }

    public static Passport findByNum(int num) {
        for (Passport passport : passports) {
            if (num == passport.getPassportNum()) {
                return passport;
            }
        }
        return null;
    }
}

