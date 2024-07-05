import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 10,15,20,25,};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            left++;
            right--;
}
}
}