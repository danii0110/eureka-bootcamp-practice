package JavaBasic.ch13.sec02.exam02;

public class CarAgency implements Retable<Car> {
    @Override
    public Car rent() {
        return new Car(); // 리턴 타입이 반드시 Car여야 함
    }
}
