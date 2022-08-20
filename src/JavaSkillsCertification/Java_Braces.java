package JavaSkillsCertification;
import java.util.*;

public class Java_Braces {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lineNumber = s.nextInt();
        for(int testCases = 0; testCases < lineNumber; testCases++) {
            String braces = s.next();
            boolean errorFlag = false;
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < braces.length();i++) {
                char val = braces.charAt(i);

                if (val == '[' || val == '{' || val == '('){
                    stack.push(val);
                } else {
                    if (stack.empty()) {
                        System.out.println("NO");
                        errorFlag = true;
                        stack.clear();
                        break;
                    }
                    char poppedVal = stack.pop();

                    if ((val == ']' && poppedVal != '[') || (val == '}' && poppedVal != '{') || (val == ')' && poppedVal != '(')) {
                        System.out.println("NO");
                        errorFlag= true;
                        stack.clear();
                        break;
                    }
                }
            }

            if (stack.empty() && !errorFlag) {
                System.out.println("YES");
            } else if (!stack.empty() && !errorFlag){
                System.out.println("NO");
            }
        }
    }
}
