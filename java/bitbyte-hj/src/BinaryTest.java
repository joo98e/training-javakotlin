public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'a';
        String s = "APPLE";
        System.out.println("s = " + s);
        
        int decibal = 69; // 10진수
        System.out.println("decibal = " + decibal);
        int binary = 0b01000101; // 2진수. 앞에 0b가 붙으면 2진수로 인식
        System.out.println("binary = " + binary);
        int octal = 0105; // 8진수. 앞에 0이 붙으면 8진수로 인식
        System.out.println("octal = " + octal);
        int hexa = 0x45; // 16진수. 앞에 0x가 붙으면 16진수로 인식
        System.out.println("hexa = " + hexa);

        int TEST10 = 123;
        int TEST2 = 0b01111011;
        int TEST8 = 0173;
        int TEST16 = 0x7B;

        System.out.println("TEST10 = " + TEST16);
        System.out.println("TEST2 = " + TEST2);
        System.out.println("TEST8 = " + TEST8);
        System.out.println("TEST16 = " + TEST16);
    }
}
