import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String password = sc.nextLine(); // Define Password
        int length = password.length(); // Convert String Length to Int
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

        if (countLenght(length)) {
            System.out.println("+ has minimum 8 letters");
        } else {
            System.out.println("Password too short");
        }
        if (countNumber(number)) {
            System.out.println("+ has a number");
        } else {
            System.out.println("Too few numbers");
        }/*
        if (checkCase(varCase)) {
            System.out.println("+ has uppercase and lowercase letters");
        } else {
            System.out.println("Password needs uppercase/lowercase letters");
        }
        /*if (commonPass(xyz)) {
            System.out.println("+ uncommon Password");
        } else {
            System.out.println("Password is too common");
        }*/

    }

    public static boolean countLenght(int length) {
        if (length < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkNumber(String password) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i)));
            return true;
        }
       return false;
    }

    /*int varCase = lowercase++;
    uppercase;*/

    public static boolean checkCase(String password) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i)));
            return true;
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
    }}

