package net.franckbenault.monitoring;

import java.util.List;

import org.javasimon.Simon;
import org.javasimon.SimonManager;
import org.javasimon.Split;
import org.javasimon.Stopwatch;

import net.franckbenault.monitoring.task.Task1;
import net.franckbenault.monitoring.task.Task2;

public class Hierarchy {
	
	private static Stopwatch stopwatch = 
			SimonManager.getStopwatch("Hierarchy");

	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			runTasks();
		}
		System.out.println(stopwatch);
		List<Simon> simons = stopwatch.getChildren();
		for(Simon simon : simons) {
			System.out.println("--"+simon);
		}
		
	}
	
	private static void runTasks() {
		Split split = stopwatch.start();
		Task1 task1 = new Task1();
		task1.run();
		Task2 task2 = new Task2();
		task2.run();
		split.stop();
	}
}
