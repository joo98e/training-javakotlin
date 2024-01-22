public class BinaryExam {
    public static void main(String[] args) {
        int data = 123;
        String binary =  Integer.toBinaryString(data); //2진수로 바꿔서 문자형으로 리턴
        System.out.println("binary = " + binary);
        String octal =  Integer.toOctalString(data); //8진수로 바꿔서 문자형으로 리턴
        System.out.println("octal = " + octal);
        String hexa =  Integer.toHexString(data); //16진수로 바꿔서 문자형으로 리턴
        System.out.println("hexa = " + hexa);
    }
}
