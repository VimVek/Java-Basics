package inheritance;

public class MultilevelInheritance {
    public void printParent(){
        System.out.println("Parent Class");
    }
}

class FirstChild extends MultilevelInheritance {
    public void printChild(){
        System.out.println("First Child");
    }
}

class FirstGrandChild extends FirstChild {
    public void printGrandChild(){
        System.out.println("FIrst Grandchild");
    }
}