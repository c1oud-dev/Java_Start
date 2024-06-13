package overloading;

public class OverLoading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }
    public static int add(int a, int b) { //이 메서드 지워도 1번 호출 됨
        System.out.println("1번 호출"); // 이유는 int형은 double로 형변환이 되기 때문
        return a + b;
    }
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
