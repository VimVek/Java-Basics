package associationAggregationComposition;

public class EmployeeAs {
    private String name;
    public EmployeeAs(String name){
        this.name = name;
    }

    public String getEmployeeName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee name= " + name ;
    }
}
