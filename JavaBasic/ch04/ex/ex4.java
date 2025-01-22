package JavaBasic.ch04.ex;

public class ex4 {
    public static void main(String[] args) {
        while(true) {
            int dice1 = (int)(Math.random() * 6 + 1);
            int dice2 = (int)(Math.random() * 6 + 1);

            if (dice1 + dice2 == 5) {
                break;
            }
        }
        System.out.println("눈의 합이 5가 되어 종료합니다.");
    }
}
