
public class MyThread extends Thread {

	@Override
	public void run() {
		
		for(int i = 10; i > 0; i--) {
			System.out.println("Thread #1: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			//  this thread will run into an error but the other thread will keep going
//			System.out.println(i/0);
			
		}
		
		System.out.println("Thread #1 is finished");
		
	}
	
}
