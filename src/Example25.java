import java.util.Scanner;
public class Example25 {
    public static void main(String[] argv) {
        int x, product;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number:");
        x = inputValue.nextInt();

        for (int i = 0; i <= 10; i++) {
            product = x * i;
            System.out.println(product);
        }
    }
}