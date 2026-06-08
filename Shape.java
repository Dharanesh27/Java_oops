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
        Vehicle b1 =new Bike();
        b1.run();
        Vehicle c1 = new Car();
        c1.run();
    }
}