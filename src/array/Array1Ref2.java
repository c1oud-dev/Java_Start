package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
        //주의 : sout에서 괄호를 빼면 문자가 되어버림, 그래서 괄호를 통해 계산을 먼저 하게 함
    }
}
