// find . -name "*.class" -delete
    public class addTwoArray {
       public static void main(String[] args) {
        int[] num1 ={1,2,3};
        int[] num2 = {2,5,6};
      
        int[] result = new int[num1.length + num2.length];
       for(int i = 0; i< num1.length; i++) {
              result[i] = num1[i];
        
        for(int j = 0; j < num2.length; j++) {
            result[num1.length + j] = num2[j];
        }
        }
        for(int num : result) {
            System.out.print(num + " ");
        }
        }
}


