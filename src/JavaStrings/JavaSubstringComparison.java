package JavaStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();

        System.out.println(getSmallestAndLargest(s,k));
    }

    private static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> sort = new ArrayList<>();
        for (int i = 0; i < s.length()-k+1; i++){
            sort.add(s.substring(i , i+k));
        }
        Collections.sort(sort);
        String small = sort.get(0);
        String max = sort.get(sort.size() -1);
        return small +"\n" +max;
    }
}
