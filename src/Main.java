import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TestScore> scores = new ArrayList<>();
        scores.add(new TestScore("yamada", 90, 60));
        scores.add(new TestScore("sato", 70,100));
        scores.add(new TestScore("tanaka", 70, 100));

               scores.stream().sorted().forEach(System.out::println);
    }
}