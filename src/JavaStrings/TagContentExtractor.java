package JavaStrings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());

        while(t-- > 0) {
            String s = input.nextLine();
            Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(s);

            if(!m.find()) {
                System.out.println("None");
                continue;
            }
            m.reset();
            while(m.find()) {
                System.out.println(m.group(2));
            }
        }
    }
}
