package JavaBasic.ch16.classEx.ex4;

public class Person {
    // Person은 전달되는 일을 수행
    public void action(Calculable calculable) {
        int result = calculable.calculate(6, 3);
        System.out.println(result); //결과 출력
    }
}