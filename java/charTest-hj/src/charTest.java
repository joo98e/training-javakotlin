public class charTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A'; // A의 ASCII 코드 값은 65
        System.out.println("a = " + a);
        int b = 'B' + 1;
        System.out.println("b = " + (char)b); // (char)의 의미는 int를 강제로 char로 변환한다는 의미. 이걸 캐스팅이라 부름
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가'; // 44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU);
        int hanU2 = '\uAC00';
        System.out.println("hanU2 = " + (char)hanU);
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower);
        
        char lower1 = 'u';
        int upper2 = lower1 - 32;
        System.out.println("upper2 = " + upper2);

        //Q. '1' + '2' = 3이 나오도록 프로그래밍 하시오
        int data = '1' + '2';
        System.out.println("data = " + data); // 99
        
        char i = '1';
        char j = '2';
        int sum = (i - '0') + (j - '0');
        System.out.println("sum = " + sum);
        
        char z = '1';
        char x = '2';
        char n = '3';
        char v = '4';
        char m = '5';
        int sum2 = (z - '0') + (x - '0') +(n - '0') +(v - '0') +(m - '0');
        System.out.println("sum2 = " + sum2);
    }
}
