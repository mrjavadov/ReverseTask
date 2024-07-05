import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int x = sc.nextInt();

        boolean y = false;
        for (int num : arr) {
            if (num == x) {
             y = true;

            }
        }

        if (y) {
            System.out.println("Arrayda bu element var: " + x);
        } else {
            System.out.println("Arrayda bu element yoxdur: " + x);
        }

    }

}
