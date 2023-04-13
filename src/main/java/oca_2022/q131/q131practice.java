package oca_2022.q131;

public class q131practice {


}

class Vehicle{
    int x;

    public Vehicle() {
        this(10);
    }

    public Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle{

    int y;

    Car() {
//        super(10);
        this(20);
    }
    Car(int y) {
        this.y = y;

    }


    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}