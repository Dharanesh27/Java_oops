class Operations{
    int num;

    Operations(int num){
        this.num = num;
    }
    int square(){
        return num*num;             //retuens value
    }
    int cube(){
        return num*num*num;         //returns value
    }
}
class NumberOperations{
    public static void main(String[] args) {
        Operations obj = new Operations(5);
        System.out.println(obj.square());       //return to print
        System.out.println(obj.cube());          //return to print
    }
}