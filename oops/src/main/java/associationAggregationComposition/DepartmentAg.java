package associationAggregationComposition;

import java.util.List;

public class DepartmentAg {
    private String name;
    private List<StudentAg> students;

    public DepartmentAg(String name, List<StudentAg> students){
        this.name = name;
        this.students = students;
    }

    public List<StudentAg> getStudents(){
        return students;
    }
}
