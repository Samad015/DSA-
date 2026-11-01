import java.util.HashMap;

public class frequencyOfElements {
    public static void main(String[] args) {
        
    
    int[] arr = {1,2,2,3,3,5,6};

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i =0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }

            map.forEach((key,value) -> {
                        System.out.println(key + " -> " + value);
            });
}
}