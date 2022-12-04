package ch6.simpleremote;

//커맨드 패턴에서 client에 해당하는 부분
public class RemoteControlTest {
    public static void main(String[] args) {
        // 리모트 변수가 인보커 역할을 한다. 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달받는다.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        
        //커맨드 객체를 생성, 리시버를 함께 전달
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
