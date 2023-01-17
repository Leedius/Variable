public class 변수06 {
    public static void main(String[] args) {
        int num1=10, num2=20;
        System.out.print("값 변경 전 : ");
        System.out.println("num1 = "+num1+", num2 = "+num2);

        int num0;
        num0=num2; num2=num1; num1=num0;
        System.out.print("값 변경 후 : ");
        System.out.println("num1 = "+num1+", num2 = "+num2);
        //num1의 값과 num2의 값을 교환하는 코드
    }
}
