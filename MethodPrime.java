import java.util.Scanner;
class MethodPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.println(prime(num));
    }
    public static boolean prime(int num){
        boolean prime = true;
        if(num<=1){
            return false;
        }
        for(int i =2;i<num;i++){
            if(num%i == 0){
                return false ;
            }
        }
        return prime;
    }
}