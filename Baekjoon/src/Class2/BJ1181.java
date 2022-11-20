package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

public class BJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        // 방법1: String 가독성 짱 But 576ms
        Arrays.stream(words).distinct().forEach(System.out::println);

        /** 방법2: 길지만 속도 짱, 384ms
        StringJoiner sj = new StringJoiner("\n");
        sj.add(words[0]);
        for (int i = 1; i < n; i++) {
            if (!words[i].equals(words[i - 1])) {
                sj.add(words[i]);
            }
        }
        System.out.println(sj);
         */
    }
}


