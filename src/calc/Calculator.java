package calc;

import grade.Grade;
import utils.MathWizard;

import java.util.Set;

public class Calculator {
    public static double calculateGrade(Set<Grade> grades) {
        double sum = 0;
        for(Grade grade : grades) {
            if(grade.grade() >= 2) {
                sum += grade.grade();
            }
        }
        return MathWizard.round(sum / grades.size(), 2);
    }
}