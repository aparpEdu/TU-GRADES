package grade;

import java.util.HashSet;
import java.util.Set;

public class GradeSource {
    public static Set<Grade> getGrades()
    {
        Set<Grade> grades = new HashSet<>();
        grades.add(new Grade("Web design", 6));
        grades.add(new Grade("Base Programming", 6));
        grades.add(new Grade("Electronics", 6));
        grades.add(new Grade("Mathematics I", 6));
        grades.add(new Grade("Mathematics II", 6));
        grades.add(new Grade("Logic and Automata", 6));
        grades.add(new Grade("English", 6));
        grades.add(new Grade("SAA", 6));
        grades.add(new Grade("System Analysis", 6));
        grades.add(new Grade("OOP I", 6));
        grades.add(new Grade("OOP II", 6));
        grades.add(new Grade("OK", 6));
        grades.add(new Grade("DS", 6));
        grades.add(new Grade("Database", 6));
        grades.add(new Grade("WEB", 6));
        grades.add(new Grade("GS", 6));
        grades.add(new Grade("Micro", 6));
        grades.add(new Grade("PS", 6));
        grades.add(new Grade("OOP PROJECT I", 6));
        grades.add(new Grade("OOP PROJECT II", 6));
        grades.add(new Grade("SIS", 6));
        grades.add(new Grade("ISU", 6));
        grades.add(new Grade("IT", 6));
        grades.add(new Grade("USP", 6));
        grades.add(new Grade("POS PROJECT", 6));
        grades.add(new Grade("POS", 6));
        grades.add(new Grade("PBD", 6));
        grades.add(new Grade("KMI", 6));
        grades.add(new Grade("TSP", 6));
        grades.add(new Grade("SP", 6));
        grades.add(new Grade("PPI", 6));
        return grades;
    }
}
