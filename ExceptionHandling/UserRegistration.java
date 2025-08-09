package ExceptionHandling;
class InvalidCountryException extends Exception {
    public InvalidCountryException(String msg) {
        super(msg);
    }
}

public class UserRegistration {
    public static void registerUser(String name, String country) throws InvalidCountryException {
        if (!country.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        try {
            registerUser("Mickey", "US");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            registerUser("Mini", "India");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
