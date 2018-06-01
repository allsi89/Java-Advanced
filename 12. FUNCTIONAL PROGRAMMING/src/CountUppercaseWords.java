import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(" ");

        Predicate<String> isUpper = word -> {
            return word.charAt(0) == word.toUpperCase().charAt(0);
        };

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isUpper.test(word)) {
                result.add(word);
            }
        }

        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
