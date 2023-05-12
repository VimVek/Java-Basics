    package inheritance;

    public class main {
        public static void main(String[] args){

            //Single Inheritance

            child c = new child();
            c.printParent();
            c.printChild();
            c.printParent();

            //Single Inheritance
            System.out.println();
            //Multilevel Inheritance

            FirstGrandChild gc= new FirstGrandChild();
            gc.printParent();
            gc.printChild();
            gc.printGrandChild();

            //Multilevel Inheritance
            System.out.println();
            //Hierarchical Inheritance

            child1 c1 = new child1();
            c1.print_parent();
            c1.print_1();

            child2 c2 = new child2();
            c2.print_parent();
            c2.print_2();

            child3 c3 = new child3();
            c3.print_parent();
            c3.print_3();

            //Hierarchical Inheritance
            System.out.println();
            //Multiple Inheritance

            MultipleChild mc = new MultipleChild();
            mc.printMultiple();
            mc.printMultiple1();

            //Multiple Inheritance
            System.out.println();
            //Hybrid Inheritance

            HybridImplementation hc = new HybridImplementation();
            hc.printMain();
            hc.printChild1();
            hc.printChild2();
            hc.printGrandChild();

            //Hybrid Inheritance
        }
    }
