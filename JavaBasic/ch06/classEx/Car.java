package JavaBasic.ch06.classEx;

public class Car {
    // 필드 추가
    String name;
    int speed;

    // 생성자 없는 경우
    // 컴파일러가 기본 생성자를 추가

    // 생성자 1개 추가
    // 컴파일러가 기본 생성자를 추가 X
//    public Car(int speed) {
//        this.speed = speed;
//    }

    // 생성자 여러개 overloading
    public Car(String name, int speed) {
        // 추가된 필드에 값 지정
        this.name = name;
        this.speed = speed;
    }

    // this() 활용
    public Car(int speed) {
        // name에 기본값 지정하고 Car(name, speed);
        this("아반떼", speed);
    }

    // 메소드 추가
    public void drive() {
        System.out.println(this.name + " 가 " + this.speed + " 로 달린다.");
    }
    public String getDriveInfo() {
        return this.name + " 가 " + this.speed + "로 달린다.";
    }

    // 메소드 overloading
    public String getDriveInfo(String road) {
        return road + " 도로를 " + this.name + "가 " + this.speed;
    }
}