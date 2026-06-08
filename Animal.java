class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meowing");
    }
}
class Main{
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.sound();
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
    }
}