package view;
import java.util.concurrent.Semaphore;
import controller.Saque;
public class SaquePrincipal {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		Semaphore semaforo2 = new Semaphore(1);
		
		
		for (int threadId = 1; threadId < 21; threadId ++) {
			Thread thread = new Saque(threadId, semaforo, semaforo2);
			thread.start();
		}
	}

}