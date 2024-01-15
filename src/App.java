
public class App {

	public static void main(String[] args) {
		Buffer buff = new Buffer();
		
		Produttore prod = new Produttore("Prod", buff, 10);
		
		ConsumatorePari conPari = new ConsumatorePari("ConsPari", buff);
		ConsumatoreDispari conDispari = new ConsumatoreDispari("ConsDisp", buff);
		
		prod.start();
		conPari.start();
		conDispari.start();
		
	}

}
