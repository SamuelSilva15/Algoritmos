package algoritmosResolvidos;

import java.util.ArrayList;
import java.util.List;

public class AvaliaçãoDeAlunos {

    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> notas = new ArrayList<>();
        for(int grade : grades) {
            notas.add(gradingStudent(grade));
        }
        return notas;
    }

    public static Integer gradingStudent(Integer grade){
        int novaNota = 5 - (grade % 5);
        if (grade >= 38 && novaNota <= 2) {
            return novaNota + grade;
        } else {
            return grade;
        }
    }

    public static void main(String[] args){
        List<Integer> notas = new ArrayList();
        notas.add(4);
        notas.add(73);
        notas.add(67);
        notas.add(38);
        notas.add(33);
        System.out.println(gradingStudents(notas));
    }

}
