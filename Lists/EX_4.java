package Lists;

import java.util.Scanner;

public class EX_4 {
    static Scanner scanner = new Scanner(System.in);
    public static String numbers = "1, 2, 3, 4, 4, 5,";
    static int zpt;


    public static void main(String[] args) {
        String result = new StringBuilder(numbers).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        result = result.replace(", ","");
        result = result.replace("", " ").trim();
        System.out.println(result);
    }
}
