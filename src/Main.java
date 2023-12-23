import grade.GradeSource;
import grade.GradeSummary;

public class Main {
    public static void main(String[] args) {
        GradeSummary.getGradeSummary(GradeSource.getGrades());
    }
}