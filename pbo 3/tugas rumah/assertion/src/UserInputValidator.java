public class UserInputValidator {
    public static void validateUsername(String username) {
        // Assertion for username
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]{4,19}") :
                "Username must be between 5 to 20 characters, start with a letter, and only contain letters, numbers, or underscore(_)";
    }

    public static void validateEmail(String email) {
        // Assertion for email
        assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") :
                "Invalid email address format";
    }

    public static void validateAge(int age) {
        // Assertion for age
        assert age >= 17 && age <= 99 :
                "Age must be between 17 and 99 years";
    }
}
