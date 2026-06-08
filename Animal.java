class Animal{
    void Sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("Meowing");
    }
}
class Main{
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.Sound();
        Dog d1 = new Dog();
        d1.Sound();
        Cat c1 = new Cat();
        c1.Sound();
    }
}