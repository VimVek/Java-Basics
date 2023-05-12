package inheritance;

public class HierarchicalInheritance {
    public void print_parent(){
        System.out.println("I am the Parent Class");
    }
}

class child1 extends HierarchicalInheritance{
    public void print_1(){
        System.out.println("I am child 1");
    }
}

class child2 extends HierarchicalInheritance{
    public void print_2(){
        System.out.println("I am child 2");
    }
}

class child3 extends HierarchicalInheritance{
    public void print_3(){
        System.out.println("I am child 3");
    }
}