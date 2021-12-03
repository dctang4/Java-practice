
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/* 
		 * threads =	A thread of execution in a program (kind of like a virtual CPU).
		 * 				The JVM allows an application to have multiple threads running concurrently.
		 * 				Each thread can execute parts of your code in parallel with the main thread.
		 * 				Each thread has a priority.
		 * 				Threads with higher priority are executed in preference compared to threads with a lower priority.
		 * 				
		 * 				The Java Virtual Machine continues to execute threads until either of the follow occurs:
		 * 					1. The exit method of class Runtime has been called.
		 * 					2. All user threads have died.
		 *  			
		 *  			When a JVM starts up, there is a thread which calls the main method.
		 *  			This thread is called "main".
		 *  			
		 *  			Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
		 *   			JVM terminates itself when all user threads (non-daemon threads) finish the execution.
		 */
		
//		System.out.println(Thread.activeCount());
		
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("MAINNNN");
//		System.out.println(Thread.currentThread().getName());

//		// priority ranges from 1 to 10 with 10 being the highest.  Default priority for main is 5.
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
		
//		System.out.println(Thread.currentThread().isAlive());
		
//		for(int i = 3; i > 0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		
//		System.out.println("You are done!");
		
		MyThread thread2 = new MyThread();
		
		System.out.println(thread2.isDaemon());
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
//		// need to start the thread or else it will not be Alive
		thread2.start();
//		System.out.println(thread2.isAlive());
		
//		System.out.println(thread2.getName());
//		thread2.setName("2nd thread");
//		System.out.println(thread2.getName());
		
//		// thread2 inherits the priority of the thread that created it.
//		System.out.println(thread2.getPriority());
//		thread2.setPriority(1);
//		System.out.println(thread2.getPriority());
		
//		System.out.println(Thread.activeCount());
	}

}
