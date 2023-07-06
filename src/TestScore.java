public class TestScore {
    private String name;
    private int scoreOfEnglish;
    private int scoreOfMath;

    public TestScore(String name, int scoreOfEnglish, int scoreOfMath) {
        this.name = name;
        this.scoreOfEnglish = scoreOfEnglish;
        this.scoreOfMath = scoreOfMath;
    }

    public String getName() {
        return name;
    }

    public int getScoreOfEnglish() {
        return scoreOfEnglish;
    }

    public int getScoreOfMath() {
        return scoreOfMath;
    }
}
