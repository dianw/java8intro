package java8intro.java8.functional;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RunnableAndCallableExample {
	private void runThread() {
		Runnable runnable = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println(this);
		};
		System.out.println(Thread.currentThread().getName());
		Thread thread = new Thread(runnable);
		thread.start();
	}

	private void callTask() throws InterruptedException, ExecutionException, TimeoutException {
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getName());
				System.out.println(this);
				return "Hello";
			}
		};
		System.out.println(Thread.currentThread().getName());
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<String> future = executorService.submit(callable);
		System.out.println(future.get(1, TimeUnit.MINUTES));
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		RunnableAndCallableExample example = new RunnableAndCallableExample();
		example.runThread();
		System.out.println("===================");
		example.callTask();
	}
}
