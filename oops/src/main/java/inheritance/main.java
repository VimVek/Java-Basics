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
        }
    }
