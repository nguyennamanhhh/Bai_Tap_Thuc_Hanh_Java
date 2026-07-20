import java.util.Arrays;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Nhap vao 10 so nguyen:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui long nhap mot so nguyen hop le!");
                System.out.print("Phan tu thu " + (i + 1) + ": ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(numbers));

        scanner.close();
    }
}
