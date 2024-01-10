import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String password = sc.nextLine();

        if (countLength(password)) {
            System.out.println("+ has minimum 8 characters");
        } else {
            System.out.println("Password too short");
        }
        if (checkNumber(password)) {
            System.out.println("+ has at least one number");
        } else {
            System.out.println("Too few numbers");
        }
        if (caseCheck(password)) {
            System.out.println("+ has uppercase and lowercase letters");
        } else {
            System.out.println("Password needs uppercase and lowercase letter");
        }/*
        if (commonPass(xyz)) {
            System.out.println("+ uncommon Password");
        } else {
            System.out.println("Password is too common");
        }
*/
    }

    public static boolean countLength(String password) {
        return password.length() >= 8;
    }

    public static boolean checkNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /*int varCase = lowercase++;
    uppercase;*/

    public static boolean caseCheck(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            }

            if (hasUpperCase && hasLowerCase) {
                break;
            }
        }
        return hasUpperCase && hasLowerCase;
    }
}
    /*public static boolean commonPass (int xyz) {
        if (){
            return false;
        } else{
            return true;
        }
    }*/

