import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int password_length = password.length();
        if (password_length >= 8) { // проверка длины пароля
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}