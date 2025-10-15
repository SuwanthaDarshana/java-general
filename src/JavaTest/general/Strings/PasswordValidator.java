package JavaTest.general.Strings;

import java.awt.*;

public class PasswordValidator {

    public static void main(String[] args) {

        String newPassword = "P@ssw0rd";
        boolean result = validatePassword(newPassword);
        System.out.println("Password valid? " + result);

    }
    static boolean validatePassword(String newPassword) {

        boolean showExpectedResult = false;
        boolean showHints = false;

        // Current credentials
        String username = "jane_doe";
        String currentPassword = "passw0rd";

        // 1. Check if at least 8 characters long
        if (newPassword.length() < 8) {
            return false;
        }

        // 2. Check if contains an uppercase letter
        boolean hasUppercase = newPassword.matches(".*[A-Z].*");

        // 3. Check if contains a special character
        boolean hasSpecialChar = newPassword.matches(".*[^a-zA-Z0-9].*");

        // 4. Check if it does not contain the username
        boolean containsUsername = newPassword.toLowerCase().contains(username.toLowerCase());

        // 5. Check if not same as current password
        boolean isSameAsOld = newPassword.equals(currentPassword);

        // Return true only if all criteria are satisfied
        return hasUppercase && hasSpecialChar && !containsUsername && !isSameAsOld;
    }
}
