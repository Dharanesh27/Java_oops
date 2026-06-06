class Operations{
    int num1;
    int num2;
    Operations(int num1, int num2){
        this.num1 =num1;
        this.num2 =num2;
    }
    void add(){
        System.out.println("Added value: " + (num1+num2));
    }
    void sub(){
        System.out.println("Subtracted value: "+ (num1-num2));
    }
}
class Calculator{
    public static void main(String[] args) {
        Operations obj = new Operations(10,20);
        obj.add();
        obj.sub();
    }
}