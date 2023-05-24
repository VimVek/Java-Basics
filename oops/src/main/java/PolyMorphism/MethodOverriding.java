package PolyMorphism;

public class MethodOverriding {
    int getInterest(){
        return 0;
    }
}

class SBI extends MethodOverriding {
    int getInterest() {
        return 4;
    }
}
class ICICI extends MethodOverriding {
    int getInterest() {
        return 5;
    }
}
class HDFC extends MethodOverriding {
    int getInterest() {
        return 6;
    }
}

class TestPoly {
    public static void main(String[] args){
        SBI sb = new SBI();
        ICICI ic = new ICICI();
        HDFC hd = new HDFC();
        System.out.println("SBI has interest: " + sb.getInterest() + " ,ICICI has interest: "
                + ic.getInterest() + " ,HDFC has interest: " + hd.getInterest());
    }



}

