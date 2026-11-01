public class mergeSortedArray {
        public static void main(String[] args) {
            int[] A = {1,2,3,0,0,0};
            int m=3;
            int[] B = {2,5,6};
            int n=3;

            int index = m+n-1,i = m-1,j = n-1;
            while(j>=0 && i>=0) {
                if(A[i] >= B[j]) {
                    A[index] = A[i];
                    index--;
                    i--;
                } else {
                    
                    A[index] = B[j];
                    index--;
                    j--;

                }
            }

            //if B still has elements
            while(j>=0) {
                A[index] = B[j];
                j--;
                index--;
            }
             // print output
        System.out.print("Output: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        }
}







// public class mergeSortedArray {
//     public static void main(String[] args) {
//         int[] A = {1, 2, 3, 0, 0, 0};
//         int m = 3;
//         int[] B = {2, 5, 6};
//         int n = 3;

//         int i = m - 1;
//         int j = n - 1;

//         // index ko for loop me decreament kiya hai
//         for (int index = m + n - 1; index >= 0; index--) {
//             // Agar B ke saare elements settle ho gaye, toh baki A ke elements already apni jagah par hain
//             if (j < 0) {
//                 break;
//             }

//             if (i >= 0 && A[i] >= B[j]) {
//                 A[index] = A[i];
//                 i--;
//             } else {
//                 A[index] = B[j];
//                 j--;
//             }
//         }

//         // Print output
//         System.out.print("Output: ");
//         for (int num : A) {
//             System.out.print(num + " ");
//         }
//     }
}