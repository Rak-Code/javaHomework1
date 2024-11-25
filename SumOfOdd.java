
public class SumOfOdd{
    public static void main(String[] args) {
       
        int[] arrodd =  {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i = 0; i < arrodd.length; i++) {
            if(arrodd[i] % 2 != 0){
                sum = sum + arrodd[i];
            }
        }
        System.out.println(sum);
        
    
}
}