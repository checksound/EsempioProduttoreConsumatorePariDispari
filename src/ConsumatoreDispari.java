
public class ConsumatoreDispari extends Thread{
	
	private Buffer buff;
	
	ConsumatoreDispari(String name, Buffer buff) {
		super(name);
		this.buff = buff;
	}
	
	public void run() {
		while(true) {
			int value = buff.getDispari();
			System.out.println(getName() + " <--- value=" + value);		}
	}

}
