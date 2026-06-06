class Details{
    String name;
    int age;

    Details(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}
class Student{
    public static void main(String[] args) {
        Details obj = new Details("John",20);
        //System.out.println(obj.name);
        //System.out.println(obj.age);
        obj.display();
        
    }
}