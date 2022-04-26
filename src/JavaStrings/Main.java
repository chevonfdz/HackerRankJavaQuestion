package JavaStrings;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        int len1 = str1.length();
        int len2 = str2.length();
        System.out.println(len1+len2);

        int val = str1.compareTo(str2);
        if (val > 0){
            System.out.println("Yes");
        } else if (val < 0) {
            System.out.println("No");
        }else {
            System.out.println("No");
        }

        String str4 = str1.substring(0,1).toUpperCase() + str1.substring(1);
        String str5 = str2.substring(0,1).toUpperCase() + str2.substring(1);
        String str3 = str4 + " " +str5;
        System.out.println(str3);

    }

}
