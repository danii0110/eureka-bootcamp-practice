//package JavaBasic.ch16.classEx.ex4;
//
//import JavaBasic.ch16.sec02.exam01.Person;
//
//public class Test {
//    //Method Reference <- Lambda 간단 표현식
//    public static void main(String[] args) {
//        Person person = new Person();
//
//        // Computer.staticMethod를 호출
//        person.action( (x, y) -> {
//            return Computer.staticMethod(x, y);
//        });
//
//        // Computer.staticMethod를 호출2 (더 간단)
//        person.action((x, y) -> Computer.staticMethod(x, y));
//
//        // Method Reference (static)
//        // 파라미터와 그 사용이 명확할 때
//        person.action(Computer::staticMethod);
//
//        // Computer 객체의 instanceMethod를 호출1
//        Computer computer = new Computer();
//        person.action((x, y) -> {
//            return computer.instanceMethod(x, y);
//        });
//
//        // Computer 객체의 instanceMethod를 호출2
//        person.action((x, y) -> computer.instanceMethod(x, y));
//
//        // Method Reference(non static)
//        // 파라미터와 그 사용이 명확할 때
//        person.action(computer::instanceMethod);
//    }
//}
