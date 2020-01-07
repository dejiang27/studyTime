package DesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Company implements Employee {

    private List<Employee> emps = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {

        for(Employee emp: emps){
            emp.showEmployeeDetails();
        }

    }

    public void addEmp(Employee emp){
        emps.add(emp);
    }

    public void removeEmp(Employee emp){
        emps.remove(emp);
    }

}
