package weeksix;

import java.util.List;

class Person {
    public String name;
    public String address;
    public String phoneNo;
    public Person(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    public void display(){
        System.out.println(name+"      "+address+"        "+phoneNo);
    }
}
