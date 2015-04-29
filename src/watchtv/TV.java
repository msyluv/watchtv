package watchtv;

public class TV {
	
	private int channel=7;
	private int volume=20;
	boolean power=false;
	
	public void channelUp(){
		this.channel++;
	}
	public void channelDown(){
		this.channel--;
	}
	public void volumeUp(){
		this.volume++;
	}
	public void volumeDown(){
		this.volume--;
	}
	public void powerOn(){
		this.power=true;
	}
	public void powerOff(){
		this.power=false;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	
}
