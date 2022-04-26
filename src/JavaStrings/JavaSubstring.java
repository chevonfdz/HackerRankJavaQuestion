package JavaStrings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(s1.substring(start,end));
    }
}
