import java.util.Scanner;
import java.io.*;

public class StringSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str = scanner.nextLine();
        for (String delStr : str.split("\\s|\\,|\\.")) {
            if (delStr.length() >= 2) {
                System.out.print((delStr.substring(delStr.length() - 1, delStr.length()) +
                        delStr.substring(1, delStr.length() - 1) + delStr.substring(0, 1)) + " ");
            } else {
                System.out.print(delStr);
            }
        }
    }
}