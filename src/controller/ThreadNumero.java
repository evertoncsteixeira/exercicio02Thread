package controller;

public class ThreadNumero extends Thread {
	public ThreadNumero() {
		
	}
	
	 @Override
	public void run() {
		System.out.println("Thread ID#" + getId());
	}
}
 
