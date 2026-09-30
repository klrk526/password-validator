public class PasswordValidator {
    public static String validate(String password) {

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
            return "OK";
        } else {
            String result = "FAIL";
        if (hasLong != true) {
            result = result + "LEN";
        } 
        if (hasUpper != true) {
            result = result + "UPPER";
        } 
        if (hasLower != true) {
            result = result + "LOWER";
        } 
        if (hasNum != true) {
            result = result + "DIGIT";
        } 
        if (hasSpecial != true) {
           result = result + "SPECIAL";
        } 
        if (hasSpace == true) {
            result = result + "SPACE";
        }
            
        }
        return"";
        
    
    
    }
    
}