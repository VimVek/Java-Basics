package inheritance;

 public class SingleInheritance {
    public void printParent(){
        System.out.println("THis is the PArent class");
    }
}

class child extends SingleInheritance{
    public void printChild(){
        System.out.println("This is CHILD");;
    }
}

