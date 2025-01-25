package JavaBasic.ch07.classEx.methodpoly;

public class MyClass { // extends Object
    int n;
    String str;

    // toString() 재정의 하지 않은 경우 Object의 toString() 사용
//    @Override
//    public String toString() {
//        return "n = " + n + ", str = " + str;
//    }


    @Override
    public String toString() {
        return "MyClass{" +
                "n=" + n +
                ", str='" + str + '\'' +
                '}';
    }
}
