public class task2 {

    public static int sumofNelements(int arr[], int n){

        if (n==0) {
            return 0;
        }
        else {
            return arr[n-1] + sumofNelements(arr, n-1);
            //Function process 1 element per recursive call
            // n elements -> n calls
            //Time Complexity: O(n)
        }

    }

}
