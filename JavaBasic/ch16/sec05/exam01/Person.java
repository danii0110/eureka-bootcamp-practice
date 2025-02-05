package JavaBasic.ch16.sec05.exam01;

import JavaBasic.ch16.sec04.Calcuable;

public class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
