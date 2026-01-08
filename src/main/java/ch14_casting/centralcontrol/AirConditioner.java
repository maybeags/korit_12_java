package ch14_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void off() {

    }
}
