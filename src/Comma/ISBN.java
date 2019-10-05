package Comma;

public class ISBN {
    public static boolean check(String str) {
        str = str.replaceAll("-", "");
        int a = 0;
        int b = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(str.length() - 1).equals("X")) {
                sum = sum + 10 + (a * (10 - i));
            } else {
                a = Integer.parseInt(str.substring(i, i + 1));
                sum = sum + (a * (10 - 1));
            }
        }
        System.out.println(sum);
        if (sum % 11 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check("5-123-45627-1"));
    }
}

