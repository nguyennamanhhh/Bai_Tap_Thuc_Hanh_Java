import java.util.Arrays;

public class Number {
    public static void main(String[] args) {
        int[] numbers = { 45, 12, 85, 32, 89, 39, 69, 10, 42, 1 };

        System.out.println("Mang ban dau: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(numbers));
    }
}
