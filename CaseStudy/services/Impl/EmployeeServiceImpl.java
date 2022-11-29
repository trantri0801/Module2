package CaseStudy.services.Impl;

import CaseStudy.Person.Employee;
import CaseStudy.services.Interface.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    private static ArrayList<Employee> arrayEmployee=new ArrayList<Employee>();
//    private static final String[] arrayLevel={null,"Intermediate","College","Undergraduate","Graduate"};
//    private static final String[] arrayLocation={null,"Receptionist","Waiter","Specialist","Supervisor","Manager","Director"};
//    private static final String[] arraySet={"Khác","Nam","Nữ"};

    public void disPlay() {
        System.out.println("List of employee: ");
        if(arrayEmployee.size()!=0)
        {
            for (Employee employee:arrayEmployee)
            {
                System.out.println(employee.toInfomation());
            }
        }
        else
        {
            System.out.println("Empty list!");
        }
    }
}
