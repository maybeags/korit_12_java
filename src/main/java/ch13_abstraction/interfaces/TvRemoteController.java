package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    /*
        onPressedChannelDownButton() 메서드와
        onDownChannelDownButton() 메서드를 정의하시오.
        정의 방식을 이상을 참조할 것.
        Main에서 tvRemoteController.onPressedChannelDown();
        Main에서 tvRemoteController.onDownChannelDown();
        메서드들을 호출하시오.
        실행 예
        Tv 리모컨 객체가 생성되었습니다. -> 생성자 건드리라는 의미
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
     */
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }
    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }
    public void onUpVolumeUpButton2() {
        System.out.println(volumeUpButton.onUp());
    }
    /*
        onPressedChannelUpButton()과
        onUpChnnelUpButton()을 생성하고
        Main에서 호출하시오.
        실행 예

        Tv 리모컨 객체가 생성되었습니다.
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
        채널을 한 칸 올립니다.
        채널을 계속 올립니다.
        전원을 끕니다.
     */
}
