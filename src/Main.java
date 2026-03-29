import java.util.Scanner;


public class Main {

    //1
    public static int sumofSquares(int n){
        if (n==1) {return n;}
        else {return n * n + sumofSquares(n - 1);}
        //Function calls itself n times
        //Each call = n*n, so operations are proportional to n
        // -> Complexity: O(n)
    }

    //2
    public static int sumofNelements(int arr[], int n){
        if (n==0) {return 0;}
        else {return arr[n-1] + sumofNelements(arr, n-1);}
        //Function process 1 element per recursive call
        // n elements -> n calls
        //Time Complexity: O(n)
    }

    //3
    public static int power(int b, int n) {
        if (n == 0) {return 1;}
        else {return b * power(b, n-1);}
        //For each n it calls power -> O(n)
    }
    public static int sumnPower(int b, int n){
        if (n==0){return 1;}
        else {return power(b, n) + sumnPower(b,n-1);}
        //and each n it calls power O(n) time
        //Time Complexity: n*n -> O(n^2)
    }

    //4
    public static void seqNreverse(int n, Scanner sc){
        if (n==0){return;}
        else {int x = sc.nextInt(); //reads number
            seqNreverse(n-1, sc);
            System.out.print(x + " ");} //prints x -> in reverse order
        //Function makes recursive calls n times
        //each reads n number of x and prints it
        //Time Complexity: O(n)
    }

    //console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1. Sum of Squares n");
        System.out.print("Enter n: ");
        int n1 = sc.nextInt();
        System.out.println("Result: " + sumofSquares(n1));

        System.out.println("Task 2. Sum of first n array elements");
        System.out.print("Enter size: ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.print("Enter array: ");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();}
        System.out.print("Enter n: ");
        int n2 = sc.nextInt();
        System.out.println("Result: " + sumofNelements(arr, n2));

        System.out.println("Task 3. Sum of b powers n");
        System.out.print("Enter base b: ");
        int b = sc.nextInt();
        System.out.print("Enter power n: ");
        int n3 = sc.nextInt();
        System.out.println("Result: " + sumnPower(b, n3));

        System.out.println("Task 4. Reverse sequence(n)");
        System.out.print("Enter n: ");
        int n4 = sc.nextInt();
        System.out.print("Enter numbers: ");
        seqNreverse(n4, sc);
        sc.close();
    }

}