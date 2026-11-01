public class removeDublicate {

   public static int  main(String[] args){
        int[] arr = { 1, 2, 3, 3, 4, 5, 5 };
        int i = 0;
        for (int j = 1; j <= arr.length-1; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
                 
        }
          return i+1;
          
    
    
    }
}
        

