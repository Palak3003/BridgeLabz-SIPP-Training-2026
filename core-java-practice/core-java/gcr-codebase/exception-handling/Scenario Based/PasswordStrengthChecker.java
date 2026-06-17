public class PasswordStrengthChecker {

    public static void checkPassword(
            String password) {

        try {

            if (password == null) {
                throw new NullPointerException();
            }

            if (password.isEmpty()) {
                System.out.println(
                        "Password cannot be empty");
                return;
            }

            if (password.length() < 8) {
                System.out.println(
                        "Password must contain at least 8 characters");
                return;
            }

            if (!Character.isUpperCase(
                    password.charAt(0))) {

                System.out.println(
                        "First character must be uppercase");
                return;
            }

            if (!Character.isDigit(
                    password.charAt(
                            password.length() - 1))) {

                System.out.println(
                        "Last character must be a digit");
                return;
            }

            if (!password.matches(
                    ".*[@#$%&*].*")) {

                System.out.println(
                        "Password must contain a special character");
                return;
            }

            System.out.println(
                    "Strong Password");

        } catch (NullPointerException e) {

            System.out.println(
                    "Password cannot be null");
        }
    }

    public static void main(String[] args) {

        checkPassword("");
        checkPassword("Abc");
        checkPassword("abcdefg1");
        checkPassword("Abcdefgh");
        checkPassword("Abcdefg@");
        checkPassword(null);
        checkPassword("Abcd@123");
    }
}