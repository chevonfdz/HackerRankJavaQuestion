package JavaStrings;

import java.util.Scanner;

public class ValidUserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n-- != 0){
            String password = input.nextLine();
            System.out.println(usernameValidation(password));
        }
    }

    /**
     *
     * @ String regex = "^[aA-zZ]\\w{7,29}$";
     * If someone manages to reach my comment, let me explain, in detail, why this works.
     * ^ represents that starting character of the string.
     * [aA-zZ] makes sure that the starting character is in the lowercase or uppercase alphabet.
     * \\w{7,29} represents a check to make sure that the remaining items are word items, which includes the underscore,
     * until it reaches the end and that is represented with $.
     * The {7,29} represents the 8-30 character constraint given to us minus the predefined first character.
     */

    private static String usernameValidation(String password) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        if (password.matches(regex)){
            return "Valid";
        }else {
            return "Invalid";
        }
    }
}
