package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int students = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};

        int[][] score = new int[students][3];
        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            double average = sum / students;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
