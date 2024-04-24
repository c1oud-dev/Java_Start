package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < 4; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < 3; column++) {
                System.out.println(subjects[column] + " 점수:");
                score[row][column] = scanner.nextInt();
            }
            /*
            for (int column = 0; column < 3; column++) {
                System.out.print("국어 점수:");
                score[row][column] = scanner.nextInt();
            }
             */
        }

        for(int row = 0; row < 4; row++) {
            int sum = 0;
            double average;
            for (int column = 0; column < 3; column++) {
                sum += score[row][column];
            }
            average = (double) sum / 3;
            System.out.println((row + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }

    }
}
