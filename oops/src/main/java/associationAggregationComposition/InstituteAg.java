package associationAggregationComposition;

import java.util.List;

public class InstituteAg {
    private String instituteName;
    private List<DepartmentAg> departments;

    public InstituteAg(String instituteName, List<DepartmentAg> departments){
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute(){
        int numOfStudents = 0;
        List<StudentAg> students;
        for (DepartmentAg dept : departments){
            students = dept.getStudents();
            for (StudentAg s:students){
                numOfStudents++;
            }
        }
        return numOfStudents;
    }
}
