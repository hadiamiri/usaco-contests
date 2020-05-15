import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        int N;
        String mailBoxColors;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        mailBoxColors = sc.next();

        // iterate on all substrings
        for (int len = 1; len < N; len++) {
            HashSet<String> hashSet = new HashSet<>();
            int j = 0;
            boolean ok = true;
            for (; j <= N - len; j++) {
                String subStr = mailBoxColors.substring(j, j + len);
                if (hashSet.contains(subStr)) {
                    ok = false;
                    break;
                } else
                    hashSet.add(subStr);
            }

            if (ok) {
                System.out.println(len);
                return;
            }
        }

    }
}