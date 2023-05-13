package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(01, "Vivek Joshi", 25, "SDE", 2700000));
        emp.add(new Employee(02, "Kush Sharma", 28, "Staff Engineer", 21000000));
        emp.add(new Employee(03, "Savi Joshi", 28, "UI Design", 3600000));
        emp.add(new Employee(04, "Abhishek Tyagi", 26, "IC-3", 4600000));
        emp.add(new Employee(05, "Mehar Mutreja", 23, "SDE", 1600000));
        emp.add(new Employee(06, "Chinari Sameer Kumar", 25, "Data Analyst", 2000000));

        //Task: Finding out all the employees whose designation is “SDE” and age is above 20.

        //We can do it directly or we can first store it in temp list and print that list
        List<Employee> tempEmp1 = emp.stream().filter(e -> e.getDesignation().equalsIgnoreCase("SDE") && e.getAge() > 20).collect(Collectors.toList());
        tempEmp1.forEach(e->System.out.println("Name:-"+ e.getName()+" , Designation :- " + e.getDesignation() + " , Age :- " + e.getAge()+" , Salary:-"+e.getSalary()));
        //emp.stream().filter(e->e.getDesignation().equalsIgnoreCase("SDE") && e.getAge() >20).collect(Collectors.toList()).forEach(e-> System.out.println("Name:-"+ e.getName()+" , Designation :- " + e.getDesignation() + " , Age :- " + e.getAge()+" , Salary:-"+e.getSalary()));

        System.out.println();
        //Task: To find all employees whose designation contain char “s”

        List<Employee> tempEmp2 = emp.stream().filter(e->e.getDesignation().contains("S")).collect(Collectors.toList());
        tempEmp2.forEach(e-> System.out.println("Name:-"+ e.getName()+" , Designation :- " + e.getDesignation() + " , Age :- " + e.getAge()+" , Salary:-"+e.getSalary()));

        System.out.println();
        //Task: To change each Employee name to upper case


    }
}