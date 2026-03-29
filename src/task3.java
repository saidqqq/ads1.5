public class task3 {

    public static int power(int b, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return b * power(b, n-1);
            //For each n it calls power -> O(n)
        }
    }


    public static int sumnPower(int b, int n){

        if (n==0){
            return 1;
        }
        else {
            return power(b, n) + sumnPower(b,n-1);
            //and each n it calls power O(n) time
            //Time Complexity: n*n -> O(n^2)
        }

    }

}
