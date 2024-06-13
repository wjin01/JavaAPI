package day16.ramda.anomymous.basic;

public class Tv {

	//
	private int volume;
	public RemoteControl remote;
	
	//생성될 때, 리모컨 객체를 갖는다(익명객체)
	public Tv() {
		remote = new RemoteControl() {
			
			//안에서 바깥을 참조할 수 있음
			@Override
			public void volumeUp() {
				volume++;
			}
			
			@Override
			public void volumeDown() {
				volume--;
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv 킴");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv 끔");
			}
		};
	}
}
