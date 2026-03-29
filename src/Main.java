import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1. Sum of Squares n");
        System.out.print("Enter n: ");
        int n1 = sc.nextInt();
        System.out.println("Result: " + task1.sumofSquares(n1));

        System.out.println("Task 2. Sum of first n array elements");
        System.out.print("Enter n: ");
        int n2 = sc.nextInt();
        int[] arr = new int[n2];

        System.out.print("Enter array: ");
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Result: " + task2.sumofNelements(arr, n2));

        System.out.println("Task 3. Sum of b powers n");
        System.out.print("Enter base b: ");
        int b = sc.nextInt();
        System.out.print("Enter power n: ");
        int n3 = sc.nextInt();
        System.out.println("Result: " + task3.sumnPower(b, n3));

        System.out.println("Task 4. Reverse sequence(n)");
        System.out.print("Enter n: ");
        int n4 = sc.nextInt();

        System.out.print("Enter numbers: ");
        task4.seqNreverse(n4, sc);

        sc.close();
    }

}