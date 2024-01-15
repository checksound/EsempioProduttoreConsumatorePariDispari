
public class Buffer {
	
	private boolean isEmpty = true;
	
	private int value;

	public synchronized int getPari() {
		
		while(isEmpty)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		while(value%2==1)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		notifyAll();
		isEmpty = true;
		return value;
	}
	
	public synchronized int getDispari() {
		
		while(isEmpty)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		while(value%2==0)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		notifyAll();
		isEmpty = true;
		return value;
	}

	public synchronized void put(int value) {
		while(!isEmpty)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		notifyAll();
		this.value = value;
		this.isEmpty = false;
	}
	
	

}
