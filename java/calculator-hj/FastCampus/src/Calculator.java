public class Calculator {
    public static void main(String[] args) {
        int numFirst = 4;
        int numSecond = 3;
        int numResult1 = numFirst + numSecond;
        int numResult2 = numFirst - numSecond;
        int numResult3 = numFirst * numSecond;
        int numResult4 = numFirst / numSecond;

        int kor, eng, result1, result2;
        kor = 80;
        eng = 67;
        result1 = kor + eng;
        result2 = result1 / 2;


        System.out.println(numResult1);
        System.out.println(numResult2);
        System.out.println(numResult3);
        System.out.println(numResult4);

        System.out.println("총점 : " + result1);
        System.out.println("평균 : " + result2);
    }
}
