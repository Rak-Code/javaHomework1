
public class CompareArray{
    public static void main(String[] args) {
       
        int[] arr1 =  {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        boolean result = false;

        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                  result = true;
            }
           
            
            
        }

    }
    System.out.println(result);
    
}
}