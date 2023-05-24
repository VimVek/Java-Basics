package inheritance;

public interface MultipleInheritance {
    public void printMultiple();
}

interface MultipleInheritance1 {
    public void printMultiple1();
}

class MultipleChild implements MultipleInheritance1, MultipleInheritance {

    @Override
    public void printMultiple() {
        System.out.println("I am Interface for multipleInheritancce");
    }

    @Override
    public void printMultiple1() {
        System.out.println("I am Second Interface for multipleInheritancce");
    }
}