class MethodLargest{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        System.out.println(findLargest(arr));
        
    }
    public static int findLargest(int [] arr){
        int largest =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }          
        }
        return largest; 
    }
}