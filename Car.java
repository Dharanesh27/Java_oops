class Car{
    String brand;
    int model;
    int price;

    Car(String brand,int model,int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void start(){
        System.out.println("The car has started");
    }
    void stop(){
        System.out.println("The car is not in move");
    }
    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
class Main{
    public static void main(String[] args) {
        Car [] cars = new Car[3];
        cars[0] =  new Car("Swift",2022,200000);
        cars[1] = new Car("Bolero",2021,200000);
        cars[2] =  new Car("Audi",2020,400000);

        for (int i = 0; i < cars.length; i++) {
            cars[i].display();
            System.out.println();
            cars[i].start();
            cars[i].stop();
            System.out.println();
            
        }
    }
}