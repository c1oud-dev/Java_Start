package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("출력");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.print(arr[j]);
            }
            else{
                System.out.print(arr[j] + ", ");
            }
        }
    }
}
