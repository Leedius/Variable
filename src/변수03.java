public class 변수03 {
    public static void main(String[] args) {
        int num;
        //자료형이 다르면 데이터 대입 불가
        //num=10.5;
        num=1;
        num=2;
        //변수에서는 데이터값 하나만 저장할 수 있다. 따라서 먼저 들어갔던 1은 사라지고 2만 들어가있다.
        System.out.println(num);

        //System.out.println(num2); 변수 사용을 위해서는 반드시 선언이 우선!

        //ex)int x; int x;
        //변수명은 중복 선언할 수 없음.
        //ex)int x; int X;
        //자바는 변수명 대소문자는 구분된다.
    }
}
