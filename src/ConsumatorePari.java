
public class ConsumatorePari extends Thread{
	
	private Buffer buff;
	
	ConsumatorePari(String name, Buffer buff) {
		super(name);
		this.buff = buff;
	}
	
	public void run() {
		while(true) {
			int value = buff.getPari();
			System.out.println(getName() + " <--- value=" + value);		}
	}

}
