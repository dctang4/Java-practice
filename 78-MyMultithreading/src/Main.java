
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// multithreading = 	Process of executing multiple threads simultaneously.
		//						Helps maximum utilization of CPU.
		//						Threads are independent, they don't affect the execution of other threads.
		//						An execution in one thread will not interrupt other threads.
		//						Useful for serving multiple clients, multiplayer games, or other mutually independent tasks.
		
		// Create a subclass of Thread
		MyThread thread1 = new MyThread();
		
		// or
		
		// implement Runnable interface and pass instance as an argument to Thread
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
//		// if an error occurs the and there are no user threads, the Daemon threads will stop executing
//		thread1.setDaemon(true);
//		thread2.setDaemon(true);
		
		thread1.start();
//		// calling thread (ex:main) wait until the specified thread dies or for x amount of milliseconds
//		thread1.join();  
//		thread1.join(3000);
		thread2.start();
		
//		//  this main thread will run into an error but the other threads will keep running
//		System.out.println(1/0);
		
	}

}
