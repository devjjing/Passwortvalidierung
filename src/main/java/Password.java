import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String password = sc.nextLine();
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
                if (ch >= 'a' && ch <= 'z')
                    lowercase++;
            }

        }
        if (lowercase == (uppercase = 0)) {

        }

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
        if (checkCase(password)) {
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
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) ;
            return true;
        }
        return false;
    }

    /*int varCase = lowercase++;
    uppercase;*/

    public static boolean checkCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;

    /*public static boolean commonPass (int xyz) {
        if (){
            return false;
        } else{
            return true;
        }
    }*/
    }

    public static boolean checkCaselower(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) ;
            return true;
        }
        return false;
    }
}

