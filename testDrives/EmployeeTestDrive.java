package testDrives;

import enitity.Employee;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Keshav");
        emp.setEmpId("101");
        emp.setEmpSalary(1200.50);
        Employee emp1 = new Employee();
        emp1.setEmpName("Krishna");
        emp1.setEmpId("103");
        emp1.setEmpSalary(1400.50);
        Employee emp2 = new Employee();
        emp2.setEmpName("Rahul");
        emp2.setEmpId("103");
        emp2.setEmpSalary(14000.25);
        Employee emp3 = new Employee();
        emp3.setEmpName("Rakesh");
        emp3.setEmpId("107");
        emp3.setEmpSalary(15000.50);
        Employee emp4 = new Employee();
        emp4.setEmpName("Shiva");
        emp4.setEmpId("111");
        emp4.setEmpSalary(1200.50);
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(emp);
        listEmp.add(emp1);
        listEmp.add(emp3);
        listEmp.add(emp2);
        listEmp.add(emp4);
        Iterator<Employee> itr = listEmp.iterator();
        System.out.println("Berfore list = "+listEmp);
        Employee tempEmp = null;
        /*while (itr.hasNext()){
            Employee tempEmp1 = itr.next();
            if(tempEmp1.getEmpName().equalsIgnoreCase("shiva")){
                tempEmp = tempEmp1;
                itr.remove();
            }
        }
        listEmp.set(0,tempEmp);          */

        tempEmp = listEmp.stream().filter(employee -> employee.getEmpName().equalsIgnoreCase("Rahul")).findAny().get();
        listEmp.remove(tempEmp);
        listEmp.add(0,tempEmp);
        System.out.println("After list = "+listEmp);
    }
}
