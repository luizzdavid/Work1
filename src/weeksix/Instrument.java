package weeksix;

public class Instrument {
    public String name;
    public double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println(name+"       "+price);
    }
}

