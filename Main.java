import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int password_length = password.length();
        
        boolean hasLong = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNum = false;
        boolean hasSpecial = false;
        boolean hasSpace = false;

        if (password_length >= 8) { // проверка длины пароля
            hasLong = true;
        } 
        for (int i = 0; i < password_length; i++) {
            char x = password.charAt(i);
            if (x >= 'A' && x <= 'Z'){
                hasUpper = true;
            } 
        }
        for (int j = 0; j < password_length; j++) {
            char y = password.charAt(j);
            if (y >= 'a' && y <= 'z') {
                hasLower = true;
            } 
        }
        for (int q = 0; q < password_length; q++) {
            char z = password.charAt(q);
            if (z >= '0' && z <= '9') {
                hasNum = true;
            }
        }
        for (int e = 0; e < password_length; e++) {
            char t = password.charAt(e);
            if (t == '!' || t == '@' || t == '#' || t == '$' || t == '%') {
                hasSpecial = true;
            }
        }
        for (int k = 0; k < password_length; k++) {
            char b = password.charAt(k);
            if (b == ' ') {
                hasSpace = true;
            }
        }
        if (hasLong == true && hasUpper == true && hasLower == true && hasNum == true && hasSpecial == true && hasSpace != true) {
            System.out.println("OK");
        } else {
            System.out.print("FAIL" + " ");
        if (hasLong != true) {
            System.out.print("LEN" + " ");
        } 
        if (hasUpper != true) {
            System.out.print("UPPER" + " ");
        } 
        if (hasLower != true) {
            System.out.print("LOWER" + " ");
        } 
        if (hasNum != true) {
            System.out.print("DIGIT" + " ");
        } 
        if (hasSpecial != true) {
            System.out.print("SPECIAL" + " ");
        } 
        if (hasSpace == true) {
            System.out.print("SPACE" + " ");
        }
            
        }
        
    }
}