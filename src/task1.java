public class task1 {

    public static int sumofSquares(int n){

        if (n==1) {
            return n;
        }
        else {
            return n * n + sumofSquares(n - 1);
            //Function calls itself n times
            //Each call = n*n, so operations are proportional to n
            // -> Complexity: O(n)
        }
    }
}
