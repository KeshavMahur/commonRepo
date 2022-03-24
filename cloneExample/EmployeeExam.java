package cloneExample;

import java.util.Objects;

public class EmployeeExam {
    private String empName;
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmployeeExam{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }

       @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeExam that = (EmployeeExam) o;
        return empId == that.empId && Objects.equals(empName, that.empName);*/
           return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empId);
       // return 1;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
