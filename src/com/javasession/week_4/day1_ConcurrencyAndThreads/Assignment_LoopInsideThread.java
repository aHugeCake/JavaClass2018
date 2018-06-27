package com.javasession.week_4.day1_ConcurrencyAndThreads;

import java.util.ArrayList;

public class Assignment_LoopInsideThread {

	public static void main(String[] args) {
		System.out.println("Main thread");
		Thread mainThread = new Thread();
		mainThread.start();
		
		int[] al = {2,5,16,45,34,2,65};
		SubThread subThread = new SubThread(al);
		subThread.start();
		
	}	
}

class SubThread extends Thread{
	private int[] al;
	
	
	public SubThread(int[] al) {
		this.al = al;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<al.length; i++) {
				Thread.sleep(1000);
				System.out.println(al[i]);
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is a new thread!");
	}
}
