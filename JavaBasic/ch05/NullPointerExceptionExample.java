package JavaBasic.ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10; // NullPointException

        String str = null;
//        System.out.println("총 문자 수: " + str.length()); // NullPointException
    }
}