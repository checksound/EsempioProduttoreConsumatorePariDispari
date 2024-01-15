import java.util.Random;

public class Produttore extends Thread {

	private Buffer buff;
	private int nunProducts;
	
	Produttore(String name, Buffer buff, int nunProducts) {
		super(name);
		this.buff = buff;
		this.nunProducts = nunProducts;
		
	}
	
	public void run() {
		Random rand = new Random();
		int counter=0;
		while(true) {
			if (counter== nunProducts)
				break;
			
			counter++;
			int value = rand.nextInt(1, 10);
			System.out.println(getName() + " inserisco value=" + value);
			buff.put(value);
			
		}
	}
	
}
