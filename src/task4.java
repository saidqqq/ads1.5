import java.util.Scanner;

public class task4 {

    public static void seqNreverse(int n, Scanner sc){

        if (n==0){
            return;
        }
        else {

            int x = sc.nextInt(); //reads number
            seqNreverse(n-1, sc);
            System.out.print(x + " "); //prints x -> in reverse order

            //Function makes recursive calls n times
            //each reads n number of x and prints it
            //Time Complexity: O(n)

        }
    }
}
