package cloneExample;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentTestDrive {
    public static void main(String[] args) {
        HashSet<EmployeeExam> al = new HashSet();
        EmployeeExam ex = new EmployeeExam();
        ex.setEmpName("Sonu");
        ex.setEmpId(10);
        EmployeeExam ex1 = new EmployeeExam();
        ex1.setEmpName("Sonu");
        ex1.setEmpId(10);
        EmployeeExam ex2 = new EmployeeExam();
        ex2.setEmpName("Shiva");
        ex2.setEmpId(11);
        EmployeeExam ex3 = new EmployeeExam();
        ex3.setEmpName("Kumar");
        ex3.setEmpId(12);
        EmployeeExam ex4 = new EmployeeExam();
        ex4.setEmpName("Kumar");
        ex4.setEmpId(12);
        al.add(ex);
        al.add(ex1);
        al.add(ex2);
        al.add(ex3);
        al.add(ex4);
        System.out.println(al);
    }
}
