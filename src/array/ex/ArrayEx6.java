package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");
        int[] numbers = new int[count];
        int max = 0, min = 2147483647;

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] >= max) {
                max = numbers[i];
            }
            if (numbers[i] <= min){
                min = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
