package day14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int[] intArr = { 10, 20, 30, 40, 50, 60 };
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int x : intArr) {
			Future futureObj = service.submit(() -> {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				return (x * x);
			});
			System.out.println(futureObj.get());
		}
		service.shutdown();
	}

}
