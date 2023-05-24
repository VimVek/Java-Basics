package associationAggregationComposition;

import java.util.Set;

public class BankAs {

    private String name;
    private Set<EmployeeAs> employees;

    public BankAs(String name){
        this.name=name;
    }
    public String geBankName(){
        return this.name;
    }
    public Set<EmployeeAs> getEmployees(){
        return this.employees;
    }

    public void setEmployees(Set<EmployeeAs> employees){
        this.employees = employees;
    }


}
