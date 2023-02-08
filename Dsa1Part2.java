public class Dsa1Part2
{
    public static void main(String[] args) 
    {
        //Listing my arrays
        int[] Arr1 = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
        int[] Arr2 = {6, 6, 9, 11, 21, 21, 21};
        //Used to use the solve method
        int[] Arr3 = solve(Arr1, Arr2); 
        //for loop so that I can print out my array	
       for (int i = 0; i < Arr3.length && Arr3[i] != 0; i++) 
       { 		
       //my answer, prints the array	
       System.out.print(Arr3[i] + " "); 		
       }
    }
    //solver method in which it will find all my matching numbers
    public static int[] solve(int[] Arr1, int[] Arr2) {
        //get my array length
        int m = Arr1.length;
        int n = Arr2.length;
        //store my answer
        int[] Arr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
        //binary search method used to find the middle index
        //what if we get a DNE?
        //check if value doesnt exit in the list
        //what if last value is empty?
        //check with the last value or list would be empty
            if (binary_search(Arr1, Arr2[i])) {
                if (k > 0 && Arr[k-1] != Arr2[i]) {
                    Arr[k++] = Arr2[i];
                } else if (k == 0) {
                    Arr[k++] = Arr2[i];
                }
            }
        }
        //to get my final array
        int[] Arr_FINAL = new int[k];
        for (int i = 0; i < k; i++) {
            Arr_FINAL[i] = Arr[i];
        }
        //return the final array
        return Arr_FINAL;
    }
    //binry search method 
    public static boolean binary_search(int[] arr, int x) {
        int l = 0;
        int r = arr.length-1;
        //while loop for while 1 is less than or equal to r
        while (l <= r) {
        //get the middle index
            int mid = (r+l)/2;
            //What happends when the middle index is X?
            //If element at index mid is equal to x return true
            if (arr[mid] == x) {
                return true;
            }
            //what if lement mid is less than x?
            //use this to search for the right part
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        //what if the element is not found?
        //return false
        return false;
    }
}