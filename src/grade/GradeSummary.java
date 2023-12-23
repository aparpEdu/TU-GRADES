package grade;

import calc.Calculator;

import java.util.Set;

public class GradeSummary {
    public static void getGradeSummary(Set<Grade> grades) {
        System.out.println("===Perfect grades===");
        for(Grade grade : grades) {
            if(grade.grade() == 6) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }
        System.out.println();
        System.out.println("===Very good grades===");
        for(Grade grade : grades) {
            if(grade.grade() == 5) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }
        System.out.println();
        System.out.println("===Good grades===");
        for(Grade grade : grades) {
            if(grade.grade() == 4) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }
        System.out.println();
        System.out.println("===Bad grades===");
        for(Grade grade : grades) {
            if(grade.grade() == 3) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }
        System.out.println();
        System.out.println("===Failed grades===");
        for(Grade grade : grades) {
            if(grade.grade() == 2) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }

        System.out.println();
        System.out.println("===Not participated===");
        for(Grade grade : grades) {
            if(grade.grade() == 1) {
                System.out.println(grade.subject() + ": "+grade.grade());
            }
        }

        System.out.println();
        System.out.println("Current AVG: " + Calculator.calculateGrade(grades));
    }



}
