package JavaBasic.ch04.ex;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 || 2. 출금 || 3. 잔고 || 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("예금액> ");
                    int deposit = Integer.parseInt(scanner.nextLine());
                    balance += deposit;
                    break;

                case "2":
                    System.out.print("출금액> ");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println("잔고 부족!");
                    }
                    break;

                case "3":
                    System.out.println("잔고> " + balance);
                    break;

                case "4":
                    System.out.println("프로그램 종료");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}