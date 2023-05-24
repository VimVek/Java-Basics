package PolyMorphism;

public class MethodOverloading {
    //Method Overloading by changing number of arguments
    // creating static methods so that we don't need to create instance for calling methods
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}

class MethodOverloading2 {
    //Method Overloading by changing data type of arguments
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(MethodOverloading.add(4,5));
        System.out.println(MethodOverloading.add(4,5,6));

        System.out.println();

        System.out.println(MethodOverloading2.add(6,9));
        System.out.println(MethodOverloading2.add(3.5,5.75));
    }
}
