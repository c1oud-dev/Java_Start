package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "B";
        switch (grade){
            case "A":
                grade = "탁월한 성과입니다!";
                break;
            case "B":
                grade = "좋은 성과입니다!";
                break;
            case "C":
                grade = "준수한 성과입니다!";
                break;
            case "D":
                grade = "향상이 필요합니다.";
                break;
            case "F":
                grade = "불합격입니다.";
            default:
                grade = "잘못된 학점입니다.";
        }
        System.out.println(grade);
    }
}
