class Operations{
    int num1;
    int num2;
    Operations(int num1, int num2){
        this.num1 =num1;
        this.num2 =num2;
    }
    void add(int a,int b){
        System.out.println("Added value: " + (a+b));
    }
    void add(double a,double b){
        System.out.printf("%.2f%n", a + b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sub(){
        System.out.println("Subtracted value: "+ (num1-num2));
    }
}
class Calculator{
    public static void main(String[] args) {
        Operations obj = new Operations(10,20);
        obj.add(10,20);
        obj.add(11.0,22.0);
        obj.add(10,10,20);
        obj.sub();
    }
}