package inheritance;

public interface HybridInheritance {
    public void printMain();
}
interface HybridInheritanceChild1 extends HybridInheritance{
    public void printChild1();
}
interface  HybridInheritanceChild2 extends HybridInheritance{
    public void printChild2();
}

interface  HybridInheritanceGrandChild extends HybridInheritanceChild1, HybridInheritanceChild2{
    public void printGrandChild();
}

class HybridImplementation implements HybridInheritanceGrandChild {

    @Override
    public void printMain() {
        System.out.println("I am the Main interface");
    }

    @Override
    public void printChild1() {
        System.out.println("I am Child interface 1");
    }

    @Override
    public void printChild2() {
        System.out.println("I am Child interface 2");
    }

    @Override
    public void printGrandChild() {
        System.out.println("I am Grand Child interface");
    }
}