package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 12;
        if (7 >= age){
            System.out.println("미취학");
        } else if (13 >= age) {
            System.out.println("초등학생");
        } else if (16 >= age) {
            System.out.println("중학생");
        } else if (19 >= age) {
            System.out.println("고등학생");
        }else {
            System.out.println("성인");
        }
    }
}
