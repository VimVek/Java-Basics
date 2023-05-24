package Encapsulation;

public class Encapsulation {
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Test{
    public static void main(String[] args){
        Encapsulation enc = new Encapsulation();
        enc.setId("A103");
        enc.setName("Vivek JoShi");
        enc.setAge(25);

        System.out.println("Name is: "+ enc.getName()+ " ,Id is: "+ enc.getId() + " and Age is: " + enc.getAge());
    }
}