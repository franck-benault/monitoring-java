package net.franckbenault.monitoring.task;

import org.javasimon.SimonManager;
import org.javasimon.Split;
import org.javasimon.Stopwatch;

public class Task2 {

	
	private static Stopwatch stopwatch = 
			SimonManager.getStopwatch("Hierarchy.task2");
	
	public void run() {
		Split split = stopwatch.start();

		String s= "";
		for(int i=0; i<1000; i++) {
			s=s+i;
		}
		split.stop();
	}

}
