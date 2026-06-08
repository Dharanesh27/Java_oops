interface Vehicle{
    void run();
}
class Car implements Vehicle{
    @Override
    public void run(){
        System.out.println("Car is on the move");
    }
}
class Bike implements  Vehicle{
    @Override
    public void run(){
        System.out.println("Bike is on the move");
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle b1 =new Bike();//can use Vehicle v = new Bike();
        b1.run();               //can use Vehicle v = new car(); only if i need to call the method that i defined in the interface;
        Vehicle c1 = new Car();
        c1.run();
    }
}