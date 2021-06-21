import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] array = input.split(",");
        if ((array.length < 1) || (array.length > 10)) { // (array.length < 1) not necessary
            throw new  IllegalArgumentException();
        }

        Integer[] numbers = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.valueOf(array[i]);
            if ((numbers[i] < -10) || (numbers[i] > 10)) {
                throw new IllegalArgumentException();

            }
        }

        int product = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentProduct = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                currentProduct *= numbers[j];
                if (currentProduct > product) {
                    product = currentProduct;
                }
            }
        }

        System.out.println(product);
    }
}
